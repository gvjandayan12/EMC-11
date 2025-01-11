using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class TomatoScript : MonoBehaviour
{
   public float wait = 0.9f;
    public GameObject tomatoObject;
    // Start is called before the first frame update
    void Start()
    {
        InvokeRepeating("Fall", wait, wait);
    }

    void Fall(){
        Instantiate(tomatoObject, new Vector3(Random.Range(-10, 10),10, 0), Quaternion.identity);
    }
}
