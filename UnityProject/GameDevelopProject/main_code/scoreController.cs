using System.Collections;
using System.Collections.Generic;
using UnityEngine;

using UnityEngine.UI;

public class scoreController : MonoBehaviour{

    GameObject scoreObj;

    public static int score;


    void Start(){
        scoreObj = GameObject.Find("SCORE");
        score = 0;
    }

    void Update(){

    }

    public void AddScore() {
        score += 10;
        scoreObj.GetComponent<Text>().text = "SCORE : " + score;
    }
}
