using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class PlayerController : MonoBehaviour
{
    Rigidbody2D playerRd;
    AudioSource audioSource;
    float jumpForce = 700.0f; 
    float walkSpeed = 20.0f;
    public AudioClip jump;
    public AudioClip item;
    
    Animator animator;
    float maxSpeed = 5.0f;


    void Start(){

        playerRd = GetComponent<Rigidbody2D>();
        audioSource = GetComponent<AudioSource>();
        animator = GetComponent<Animator>();
        animator.speed = 0f;
    }
    
    void Update(){

        if(Input.GetKeyDown(KeyCode.Space) == true && transform.position.y <= -4f){
            animator.SetTrigger("JumpCall");
            playerRd.AddForce(transform.up * jumpForce);
            audioSource.PlayOneShot(jump);            
        }

        float speedx = Mathf.Abs(playerRd.velocity.x);
        
        if(speedx < maxSpeed){

            if(Input.GetKey(KeyCode.LeftArrow) == true){
                playerRd.AddForce(transform.right * -1 * walkSpeed);
                transform.localScale = new Vector3(-1.0f, 1.0f, 1);
            }

            if (Input.GetKey(KeyCode.RightArrow) == true){
                playerRd.AddForce(transform.right * walkSpeed);
                transform.localScale = new Vector3(1.0f, 1.0f, 1);
            }

        }

        animator.speed = speedx;

        if(transform.position.y < -12){
            SceneManager.LoadScene("Fail2");
        }
    }

    void OnCollisionEnter2D(Collision2D col){
        if(col.gameObject.tag == "Item"){        
            audioSource.PlayOneShot(item);
        }
    }
    
    private void OnTriggerEnter2D(Collider2D other)
    {
        if(other.tag == "Finish1")
        {
            SceneManager.LoadScene("Clear1");
        }
        if(other.tag == "Finish2")
        {
            SceneManager.LoadScene("Clear2");
        }                
    }
}
