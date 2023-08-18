using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class trapController : MonoBehaviour
{
    public float speed;
	
	void Start () {
	}
	
	void Update () {

	}
    void OnCollisionEnter2D(Collision2D col){
        
        GameObject hp = GameObject.Find("HPControl");

        if(col.gameObject.tag == "PLAYER"){
            hp.GetComponent<hpController>().HpControl();
        }
    }

}
