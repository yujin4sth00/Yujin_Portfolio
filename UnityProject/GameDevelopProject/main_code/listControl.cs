using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class listControl : MonoBehaviour
{
    // Start is called before the first frame update
    public void SceneChange()
    {
        SceneManager.LoadScene("StageScene1");
    }
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }
}
