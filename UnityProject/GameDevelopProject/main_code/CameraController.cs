using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CameraController : MonoBehaviour
{
    [SerializeField] Transform player;
    [SerializeField] float smooth = 0.2f;
    [SerializeField] Vector2 minCamPos;
    [SerializeField] Vector2 maxCamPos;
    private void FixedUpdate()
    {
        Vector3 targetPos = new Vector3(player.position.x, player.position.y, transform.position.z);

        targetPos.x = Mathf.Clamp(targetPos.x, minCamPos.x, maxCamPos.x);
        targetPos.y = Mathf.Clamp(targetPos.y, minCamPos.y, maxCamPos.y);

        transform.position = Vector3.Lerp(transform.position, targetPos, smooth);
    }
}