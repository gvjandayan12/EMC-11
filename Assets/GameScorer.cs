using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.SceneManagement;

public class GameScorer : MonoBehaviour
{
    public GameObject knife;
    public GameObject knife1;
    public GameObject knife2;
    public Text scoreText;
    int health = 3;
    int score;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        scoreText.text = score.ToString();
        scoreText.text = "Score : " + score;
    }
    private void OnTriggerEnter2D(Collider2D collision){
        if(collision.gameObject.CompareTag("Apple")){
            Destroy(collision.gameObject);
            health--;
            Debug.Log("Apple is not allowed");

            if(health == 2){
                Destroy(knife);
            }
            else if(health == 1){
                Destroy(knife1);
            }
            else if(health == 0){
                GameOverTransition();
                Destroy(knife2);
            }

        }
        else if(collision.gameObject.CompareTag("Bawang")){

            Destroy(collision.gameObject);
            score++;
            Debug.Log("Bawang Scored");
        }
        else if(collision.gameObject.CompareTag("Meat")){

            Destroy(collision.gameObject);
            score++;
            Debug.Log("Meat Scored!");
        }
        else if(collision.gameObject.CompareTag("Tomato")){

            Destroy(collision.gameObject);
            score++;
            Debug.Log("Tomato Scored!");
        }

    }
    private void GameOverTransition(){
        SceneManager.LoadScene("GameOverScene");
    }
  
}
