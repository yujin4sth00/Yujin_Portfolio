using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class bgControl : MonoBehaviour
{
    public float imgspeed = 20.0f;

    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        transform.Translate(imgspeed *20* Time.deltaTime, 0, 0);
    if(gameObject.transform.position.x >= 50)
        {
            Destroy(gameObject);
        }
    }
    
    

}

