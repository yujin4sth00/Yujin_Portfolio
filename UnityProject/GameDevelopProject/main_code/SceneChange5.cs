using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class SceneChange5 : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        Invoke("SceneChange", 2);
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    void SceneChange()
    {
        SceneManager.LoadScene("GameEnd");
    }
}
