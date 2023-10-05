# GameDevelopProject
https://drive.google.com/file/d/1PVnHQbb5PAX6zqQiLjMx8KR-e33AUqAs/view?usp=drive_link <br>
💻팀 프로젝트<br>
💻제작기간<br>
|세부내용|기간|
|-----------|-------|
|게임의 전체적인 컨셉 설정 및 레퍼런스 이미지 제작|2023.03.15~2023.04.12|
|모티브가 된 게임을 통해 각 스테이지의 진행 방법 구성, 제작할 게임 파트 분배, 게임에 사용할 에셋 정하고 공유|2023.04.13~2023.05.10|
|담당한 게임 파트의 계획서 작성 및 공유 후 각자 담당한 씬 제작 시작|2023.05.11~2023.06.11|
|담당한 부분들에 대한 팀원의 피드백 공유, 씬 전체적으로 수정하고 통합시키는 작업 진행|2023.06.12~2023.06.18|
|제작한 씬 합치고 전환과 오류 여부 확인, 보고서 및 발표자료 작성&준비|2023.06.18~2023.06.19|
<br>
발표 자료<br>
![image](https://github.com/yujin4sth00/GameDevelopProject/assets/115778958/1f16160b-ca00-4572-8240-e567d049c147)
![image](https://github.com/yujin4sth00/GameDevelopProject/assets/115778958/cd6a0f87-048c-48e2-80d6-e84286593087)
![image](https://github.com/yujin4sth00/GameDevelopProject/assets/115778958/60898e7d-7bf1-4e4a-9749-c00a5499c82a)
![image](https://github.com/yujin4sth00/GameDevelopProject/assets/115778958/e85bc3ec-0b55-4bd4-a44c-1c6bd518e895)

![image](https://github.com/yujin4sth00/GameDevelopProject/assets/115778958/9451b687-5071-4801-bf81-783f619f2b9b)
![image](https://github.com/yujin4sth00/GameDevelopProject/assets/115778958/e8dadb51-ac6a-40f2-bcec-93a0aa80e28a)
![image](https://github.com/yujin4sth00/GameDevelopProject/assets/115778958/255e73a0-e4c9-4b23-818c-14191e772afb)
![image](https://github.com/yujin4sth00/GameDevelopProject/assets/115778958/948d2119-cb1e-4791-9bf2-94cc572fc7d4)

![image](https://github.com/yujin4sth00/GameDevelopProject/assets/115778958/99a012d2-5be9-4f7a-8e20-fc3109daa1fa)
![image](https://github.com/yujin4sth00/GameDevelopProject/assets/115778958/4dc501b3-ad3e-4f7a-baa6-49b68ec9e695)
![image](https://github.com/yujin4sth00/GameDevelopProject/assets/115778958/ec567442-1c69-4fda-8e95-b7841cb944e7)
![image](https://github.com/yujin4sth00/GameDevelopProject/assets/115778958/beeae1e5-e964-4207-94f2-057a5657226a)


>PlayerController(캐릭터 이동 코드)
방향키를 누르는 동안 좌우로 이동하고 스페이스바를 눌렀을 때 점프가 가능하도록 했다. 플레이어가 걷는 속도와 점프하는 힘의 기본값을 두었고 지정한 높이보다 높아졌을 때 점프가 불가능하도록 설정했다. 플레이어가 특정 태그를 가진 오브젝트와 충돌하게 되면 함수를 호출하도록 해서 점수 상승과 다른 씬으로 연결이 되도록 코드를 작성했다. 각 스테이지별로 태그가 ‘Item’인 오브젝트와 충돌하면 점수가 상승하고, 태그가 ‘Finish’인 오브젝트와 플레이어가 충돌하게 되면 클리어 씬으로 전환되도록 설정했다.



>CameraController(카메라 이동 코드)
SerializeField를 이용해서 private으로 설정된 카메라 위치 지정 변수를 inspector창에서도 변경할 수 있도록 했다. 카메라가 플레이어를 따라갈 때 원하는 범위만큼만 보여줄 수 있도록 하기 위해서 카메라 좌표에 최솟값과 최댓값을 설정하고 player가 이동할때 카메라가 맵을 벗어나지 않도록 코드를 작성했다.
