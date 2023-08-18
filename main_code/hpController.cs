using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

using UnityEngine.SceneManagement;

public class hpController : MonoBehaviour{

    GameObject hp;

    void Start(){

        hp = GameObject.Find("HP");    

    }

    void Update(){  }
    
    public void HpControl(){

        hp.GetComponent<Image>().fillAmount -= 0.34f;

        if(hp.GetComponent<Image>().fillAmount <= 0 && SceneManager.GetActiveScene().name == "Stage1"){

            SceneManager.LoadScene("Fail1");
        }
        else if(hp.GetComponent<Image>().fillAmount <= 0 && SceneManager.GetActiveScene().name == "Stage2"){
            SceneManager.LoadScene("Fail2");
        }
    }

}
