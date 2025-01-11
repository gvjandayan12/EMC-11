using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class AppleScript : MonoBehaviour
{
    public float wait = 0.9f;
    public GameObject appleObject;
    // Start is called before the first frame update
    void Start()
    {
        InvokeRepeating("Fall", wait, wait);
    }

    void Fall(){
        Instantiate(appleObject, new Vector3(Random.Range(-10, 10),10, 0), Quaternion.identity);
    }
}
