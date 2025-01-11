using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerMovement : MonoBehaviour
{
   public float speed = 20f;
    Rigidbody2D rigidbody2d;

    
    void Start()
    {
        rigidbody2d = GetComponent<Rigidbody2D>();
    }
    // Update is called once per frame
    void Update()
    {
        float horizontal = Input.GetAxis("Horizontal") * speed * Time.deltaTime;

        transform.position += new Vector3(horizontal, 0, 0);
    }

    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.gameObject.CompareTag("Apple"))
        {
            Debug.Log("You hit Apple");
            Destroy(collision.gameObject);
        }
        else if(collision.gameObject.CompareTag("Bawang")){
            
            Debug.Log("You hit Bawang!");
            Destroy(collision.gameObject);
        }
        else if(collision.gameObject.CompareTag("Meat")){

            Debug.Log("You hit Meat");
            Destroy(collision.gameObject);
        }
        else if(collision.gameObject.CompareTag("Tomato")){

            Debug.Log("You hit Tomato");
            Destroy(collision.gameObject);
        }

    }
}
