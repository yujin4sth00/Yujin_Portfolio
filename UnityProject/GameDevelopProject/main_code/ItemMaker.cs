using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ItemMaker : MonoBehaviour
{
    public GameObject breadPrefab;

    void Start(){
        for(int i=0; i<20; i++){
            GameObject bread = Instantiate(breadPrefab);
            int x = Random.Range(-30, 80);
            int y = Random.Range(-8, -4);
            bread.transform.position = new Vector3(x, y, 0);
        }
    }

    void Update(){    }
}