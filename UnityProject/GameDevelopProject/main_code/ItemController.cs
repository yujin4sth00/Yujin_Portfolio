using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ItemController : MonoBehaviour
{
    void Start(){   }

    void Update(){  }

    void OnCollisionEnter2D(Collision2D col){

        GameObject score = GameObject.Find("SCOREControl");

        if(col.gameObject.tag == "PLAYER"){
            
            score.GetComponent<scoreController>().AddScore();
        }
        
        Destroy(gameObject);
    }
}
