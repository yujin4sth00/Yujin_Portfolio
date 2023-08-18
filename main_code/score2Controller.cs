using System.Collections;
using System.Collections.Generic;
using UnityEngine;

using UnityEngine.UI;
public class score2Controller : MonoBehaviour
{
    GameObject scoreObj;

    public static int score;
    // Start is called before the first frame update
    void Start()
    {
        scoreObj = GameObject.Find("SCORE");
        score = 0;
    }

    // Update is called once per frame
    void Update()
    {
        
    }
    public void AddScore1() {
        score += 10;
        scoreObj.GetComponent<Text>().text = "SCORE : " + score;
    }
}
