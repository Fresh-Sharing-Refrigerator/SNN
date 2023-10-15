# 🧊 신나냉

<img src="Docs/image/login.png" width="80%">

# 📃목차

1. [프로젝트소개](#프로젝트-소개)
2. [개발기간](#개발-기간)
3. [설계](#설계)
4. [주요기능(캡쳐)](#주요-기능)
5. [시연화면](#시연-화면)
6. [개발환경](#개발-환경)
7. [프로젝트 회고](#프로젝트-회고)
8. [팀원소개](#멤버-구성)

# 💡프로젝트 소개

### 서비스 소개

- 화상채팅을 통해 비대면으로 게임을 진행하고, 웃은 횟수에 따라 점수를 부여해 서로 경쟁하는 게임 플랫폼입니다.

### 서비스 특징

- 웹캠과 WebRTC기술을 활용해 비대면으로 여러명이 실시간으로 게임에 참여 가능

- 사용자의 얼굴 변화를 체크해 웃음 횟수를 체크하고 이를 결과에 반영함

### 기획 배경

- 최근 유튜브에서 많은 인기를 얻고 있는 메타코미디 클럽, 유병재의 생일파티, 조충현의 웃으면 강퇴 등의 컨텐츠 들의 공통점인 `웃음참기`에 초점을 맞춤

- 웃음을 참는 것으로 재미를 얻을 수 있다는 속성 반영

- 간단하게 즐길 수 있는 게임에 이를 적용

<br>

# 📆개발 기간

- 23.07.10일 - 23.08.18일

<br>

# 💡설계

### 1. ERD

<img src="Docs/image/ERD.png" width="80%">

### 2. 시스템 아키텍처

<img src="Docs/image/System Architecture.png" width="80%">

<br>

# ✨주요 기능

### 1. 웃음 참기 게임

- 메인화면에서 카메라, 마이크 설정을 통해 시작하기 버튼 활성화

- 시작하기 버튼을 통한 게임 매칭 실행

- 5인 매칭 성공 시 게임룸으로 이동

- 게임 룰

  1. 미션 선택 후 해당 미션에 따른 개그 진행

  2. 웃을 시 컴포넌트에 이펙트가 발생하며 카운트가 늘어남

  3. 발표자는 카운트 되지 않음

  4. 입을 가려 인식이 되지 않으면 5초에 1번씩 카운트가 올라감

  5. 화면공유를 통해 영상 매체 활용 가능, 채팅 가능

  6. 결과가 끝나면 카운트 된 웃음 횟수별로 순위 지정 및 점수 반영

### 2. OpenVidu를 화상 통화 & 채팅

- 게임을 진행하기 위해 매칭이 잡힌 유저끼리 화상 채팅을 연결함
- 채팅을 통해 서로 소통할 수 있음

### 3. FaceAPI를 활용한 웃음 캐치

- 화면의 변화를 FaceAPI를 활용해 웃은 횟수를 체크해서 최종 순위에 반영함
- 얼굴이 인식되지 않는 경우 5초를 기준으로 카운트가 1회씩 증가함
- 얼굴을 가리고 웃거나 화면을 이탈하는 경우를 방지함

### 4. 도감

- 게임을 통해 얻은 포인트로 프로필사진, 테두리, 이름표를 구매할 수 있음
- 구매한 아이템을 확인 할 수 있고, 아이템을 교체할 수 있음

### 5. 랭킹

- 레이팅을 통해 유저들의 랭킹을 확인할 수 있음

<br>

# 🔫시연 화면

## **기본 UI**

#### 회원가입

![signup_1](/Docs/gif/signup_email.gif)
![email](/Docs/gif/signup_email_check.gif)
![signup_2](/Docs/gif/signup_password.gif)
![signpu_nickname_check](/Docs/gif/signup_nickname_check.gif)

#### 로그인

![login](/Docs/gif/login.gif)

#### 로그아웃

![logout](/Docs/gif/logout.gif)

#### 홈

#### 공지

![notice](/Docs/gif/notice_user.gif)

#### 도감

![collection](/Docs/gif/collection_no_money.gif)
![collection_list](/Docs/gif/collection_image.gif)
![collection_list](/Docs/gif/collection_fream.gif)

#### 랭크

![rank](/Docs/gif/rank.gif)

## **게임 UI**

#### 게임 실행

1. 매칭

![game_matching](/Docs/gif/game_matching.gif)

2. 매칭 수락

![game_accept](/Docs/gif/game_accept.gif)

3. 미션 선택

![game_choice](/Docs/gif/game_choice.gif)

4. 게임 시작

![game_first](/Docs/gif/game_first.gif)

5. 채팅

![game_chating](/Docs/gif/game_chating.gif)

6. 다음 순서 대기

![game_wait](/Docs/gif/game_wait.gif)

7. 게임 결과

![gmae](/Docs/gif/game_end.gif)

# 🛠️개발 환경

#### 💻 **IDE**

    - Intellij
    - Visual Studio Code

#### 🔧 **Backend**

    - Springboot 2.7.2
    - Java 11
    - Gradle 8.2.1
    - JPA
    - MySQL 8.1.0
    - Swagger
    - WebSocket

#### 🎨 **Frontend**

    - HTML, CSS
    - JavaScript
    - Vue 3.2.37
    - Node.js 16.16.0

#### 🚀 **배포**

    - AWS EC2
    - Ubuntu 20.04
    - Jenkins
    - Docker 20.10.17

#### 📊 **버전/이슈 관리**

    - Jira
    - GitLab

#### 🔨 **Tool**

    - Postman
    - Figma

#### 🤝 **협업**

    - Mattermost
    - Notion

# ✏️프로젝트 회고

### JWT와 Redis의 사용

    - JWT를 DB에 저장하지 않고 Redis에 저장함
    - 토큰은 발급 후 일정 시간 이후 만료처리 해야하기 때문에 DB에 직접 저장하고 시간이 지나면 삭제하는 과정을 처리하기 위해선 스케줄러를 사용해 주기적으로 처리해야함
    - Redis는 기본적으로 데이터의 유효 기간을 지정할 수 있기 때문에 토큰 관리에 적합하다고 판단함

### BlackList 사용에 대한 의문

    - 로그아웃을 한 토큰을 구분하기 위해 BlackList로 등록하여 구분함
    - 이 때, redis에 저장된 토큰을 삭제하는것과 BlackList로 추가 등록하는것의 차이점에 대한 의문이 있었음
    - 직접 삭제와 블랙리스트 사용의 차이점은 상황에 따라 다르다는 결론을 내림.
    - 직접 삭제할 때의 장점은 단순성과 blacklist를 추가 조회하지 않기 때문에 성능부분에서 이점이 있음
    - BlackList를 사용하면 조금 더 높은 보안 수준을 제어하기 위해 사용하며 토큰 체크를 2중으로 한다는 느낌으로 받아드림

### Procedure의 사용에 대한 의문

    - 하나의 요청으로 여러 SQL문을 실행할 수 있기 때문에 네트워크 부하를 줄일 수 있다는 장점때문에 사용함
    - 그렇다면, 어떤 상황이 Procedure를 사용하기에 적합한지에 대한 의문을 가짐
    - 이 프로젝트에서 게임이 끝날 때 게임포인트와 랭킹포인트를 반영하는데 있어서 프로시저를 사용함
    - 게임포인트가 깎여서 음수가 될 경우 0점으로 처리함
    - 이 때, 이 과정을 Procedure로 등록하여 처리함 => 이 과정을 Procedure에서 처리하는게 과연 올바른 선택인지에 대한 의문을 가짐
    - 의문에 대한 해소를 하지 못함. 상황에 따라 많은 경우의 수가 있을 수 있음.
    - 하지만 위의 경우는 백단에서 처리를 한 후 하나의 쿼리 실행으로 변경하는 것이 맞다고 생각을 함 => 한 번의 쿼리 호출로 해결할 수 있기 때문

### 느낀점

    - Infra에 관한 기본 지식이 필요하다는 생각을 함
    - Ec2 서버를 이용해 배포를 진행하였지만 이 부분에 대한 지식이 많이 부족하여 어려움을 겪음
    - Docker를 처음 접하면서 기본적인 개념을 이해하는데 도움이 됨
    - Spring Data JPA를 사용하되 queryDSL을 이용해 동적쿼리를 작성해보는 연습을 해보고싶다고 느낌
    - JPA의 N+1문제에 대한 이해도가 부족하다는 생각이 들었음. 의도하지 않는 추가적인 데이터 조회를 확인했으나 이를 해결하지 못함. 추후에 공부를 통해 해결해보고 싶음
    - 이번 프로젝트를 진행하면서 JPA, JWT, Redis, Docker 등 처음 적용해보는 기술들이 많아서, 이를 공부하고 적용해보면서 재미를 느낌. 결과물은 기대에 미치지 못했지만 개인적으론 많은 성장을 하게 된 프로젝트라고 생각함

# 👨‍👨‍👦‍👧멤버 구성

|                                김석주                                 |                                박예한                                 |                                옥수빈                                 |                                왕준영                                 |                                이주용                                 |                                임휘진                                 |
| :-------------------------------------------------------------------: | :-------------------------------------------------------------------: | :-------------------------------------------------------------------: | :-------------------------------------------------------------------: | :-------------------------------------------------------------------: | :-------------------------------------------------------------------: |
| <img src="Docs/image/김석주.jpg" width="80px;" height="80px" alt=""/> | <img src="Docs/image/박예한.jpg" width="80px;" height="80px" alt=""/> | <img src="Docs/image/옥수빈.jpg" width="80px;" height="80px" alt=""/> | <img src="Docs/image/왕준영.jpg" width="80px;" height="80px" alt=""/> | <img src="Docs/image/이주용.jpg" width="80px;" height="80px" alt=""/> | <img src="Docs/image/임휘진.png" width="80px;" height="80px" alt=""/> |
|                        Back-end<br/>Api Server                        |                        Back-end<br/>Infra<br/>                        |                            Front-end<br/>                             |                        Back-end<br/>Game Sever                        |                            Front-end<br/>                             |                            Front-end<br/>                             |

<br/>

## SSAFY 9기 특화 프로젝트

# 좋은 냉장고, 신선한 나눔 - 좋냉신나

- 냉장고 식자재 관리 및 나눔 서비스
- [apk 다운로드](https://1drv.ms/u/s!AkrJpxi-ZmutiPNutUjyN42GvDJ0_A?e=c2RFwU)
  <img src="screenshots/Screenshot_20231006-113354_좋냉신나.png" width="250"/>

## 팀원 소개

| NAME   | ROLE                | EMAIL                    |
| ------ | ------------------- | ------------------------ |
| 김석주 | Leader, Backend     | tjrwn1247@naver.com      |
| 김수현 | Backend             | ppsracchriskim@gmail.com |
| 곽민규 | Frontend, Backend   | tngks1995@naver.com      |
| 금세현 | Backend, BlockChain | shkum0330@gmail.com      |
| 왕준영 | Backend, Infra      | wangsun7@naver.com       |
| 윤태영 | Frontend            | yyytae0@gmail.com        |

## 기획 배경

### 1. 기존 냉장고 관리 어플리케이션의 한계

- 기존의 냉장고 관리 어플리케이션은 식재료 등록이 번거롭고, 적절한 활용처를 제공해주지 않음

### 2. 여러 명이 한 냉장고를 사용할 때의 어려움

- 가구 구성원끼리 냉장고를 공유하는 경우 정확한 식재료 파악이 어려움

### 3. 소비 패턴의 변화와 그에 따른 식재료 폐기 증가

- 가구 구성원 수가 줄어들고 배달 문화가 발달하면서, 소비기한 내에 먹지 못하고 폐기되는 식재료의 양이 증가함

## 기능

### 레시피 추천 & 소비기한 임박 재료 알림

<img src="screenshots/Screenshot_20231006-113415_좋냉신나.png" width="250"/>

### 레시피 상세 검색

<img src="screenshots/Screenshot_20231006-113422_좋냉신나.png" width="250"/>

### 남는 식재료 나눔

<img src="screenshots/Screenshot_20231006-113502_좋냉신나.png" width="250"/>

### 식재료 자동완성/OCR/STT 일괄 등록

<img src="screenshots/Screenshot_20231006-113645_좋냉신나.png" width="250"/>

## 개발 환경 및 IDE

### FrontEnd

> ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
> ![Node.js](https://camo.githubusercontent.com/ab61fce6586c27e04d8ac35d0a77a20b78eb57de63ac2243353f23d3752b1fc3/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4e6f64652e6a732d3333393933333f7374796c653d666f722d7468652d6261646765266c6f676f3d4e6f64652e6a73266c6f676f436f6c6f723d7768697465)
> ![NPM](https://img.shields.io/badge/NPM-%23CB3837.svg?style=for-the-badge&logo=npm&logoColor=white)
> ![React Native](https://img.shields.io/badge/react_native-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB)
> ![IntelliJ](https://camo.githubusercontent.com/d479352761a86806b779129f4be8909d1c8c1fb1e2805bbd86cacd276f831cfa/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f496e74656c6c696a5f494445412d3337373641423f7374796c653d666f722d7468652d6261646765266c6f676f3d496e74656c6c696a49444541266c6f676f436f6c6f723d7768697465)
> ![Android Studio](https://img.shields.io/badge/Android_Studio-%232022a.svg?style=for-the-badge&logo=androidstudio&logoColor=white)

### BackEnd

> ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
> ![Spring Boot](https://camo.githubusercontent.com/d04cac57f1f6d0a39ebd084333a6e4d93081a42c9e5aa1b3b511e75ad1a1e20f/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f537072696e675f426f6f742d3644423333463f7374796c653d666f722d7468652d6261646765266c6f676f3d537072696e67426f6f74266c6f676f436f6c6f723d7768697465)
> ![Gradle](https://camo.githubusercontent.com/ce0bfcaef68659861b497d6dfc5b8b783c2955705472b4e55151f196347d9271/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f477261646c652d4633373434303f7374796c653d666f722d7468652d6261646765266c6f676f3d477261646c65266c6f676f436f6c6f723d7768697465)
> ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?&style=for-the-badge&logo=mysql&logoColor=white)
> ![Redis](https://img.shields.io/badge/redis-DC382D.svg?&style=for-the-badge&logo=redis&logoColor=white)
> ![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

### BlockChain

> ![Ethereum](https://img.shields.io/badge/Ethereum-3C3C3D6?style=for-the-badge&logo=ethereum&logoColor=white)
> ![Solidity](https://img.shields.io/badge/Solidity-363636?style=for-the-badge&logo=solidity&logoColor=white)

### Infra

> ![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white)
> ![Ubuntu](https://img.shields.io/badge/Ubuntu-E95420?style=for-the-badge&logo=ubuntu&logoColor=white)
> ![CloudFlare CDN](https://img.shields.io/badge/cloudflare-%23F38020.svg?&style=for-the-badge&logo=cloudflare&logoColor=white)
> ![Nginx](https://img.shields.io/badge/nginx-%23009639.svg?style=for-the-badge&logo=nginx&logoColor=white)
> ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
> ![Jenkins](https://camo.githubusercontent.com/9cadc6063746e385b3916ea6ee991ec8eea88306de9208ccf5a94111c0ddf6ee/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4a656e6b696e732d4432343933393f7374796c653d666f722d7468652d6261646765266c6f676f3d4a656e6b696e73266c6f676f436f6c6f723d7768697465)
> ![RabbitMQ](https://img.shields.io/badge/rabbitmq-FF6600.svg?style=for-the-badge&logo=rabbitmq&logoColor=white)

### Development Tool

![IntelliJ](https://camo.githubusercontent.com/d479352761a86806b779129f4be8909d1c8c1fb1e2805bbd86cacd276f831cfa/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f496e74656c6c696a5f494445412d3337373641423f7374796c653d666f722d7468652d6261646765266c6f676f3d496e74656c6c696a49444541266c6f676f436f6c6f723d7768697465)
![VisualStudioCode](https://img.shields.io/badge/visual_studio_code-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white)
![AndroidStudio](https://img.shields.io/badge/android_studio-3DDC84?style=for-the-badge&logo=visualstudiocode&logoColor=white)

### Communication Tool

> ![Mattermost](https://camo.githubusercontent.com/04ce7d705b23f2f899a4acd58de46152ea9ab352ce310182432c59db1bd3e74e/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4d61747465724d4f53542d3030393638383f7374796c653d666f722d7468652d6261646765266c6f676f3d4d61747465726d6f7374266c6f676f436f6c6f723d7768697465)
> ![Jira](https://img.shields.io/badge/jira-%230A0FFF.svg?style=for-the-badge&logo=jira&logoColor=white)
> ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
> ![GitLab](https://camo.githubusercontent.com/cb99570e6da369466c9991c5400a2516cec86a958fc80bc152dcdc020b5e581f/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f6769746c61622d4643364432363f7374796c653d666f722d7468652d6261646765266c6f676f3d4769744c6162266c6f676f436f6c6f723d7768697465)
> ![Notion](https://camo.githubusercontent.com/e6016a8747f69a4f7c5cac44f04f81136a1294f2973f25a8d4c53651337a3d78/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4e6f74696f6e2d4546313937303f7374796c653d666f722d7468652d6261646765266c6f676f3d4e6f74696f6e266c6f676f436f6c6f723d7768697465)
> ![Figma](https://img.shields.io/badge/figma-%23F24E1E.svg?style=for-the-badge&logo=figma&logoColor=white)

## 설계 및 산출물

- [요구사항 정의서](https://www.notion.so/b5cda16927484ff18de603dc57afffab?pvs=4)
- [와이어 프레임](https://www.figma.com/file/Zbq5uxPolrcGTBqj0YG5mu/%ED%99%98%EA%B2%BD%EB%B3%B4%ED%98%B8%EB%B2%94?type=design&node-id=0%3A1&mode=design&t=awZIiBr4fW0UVzbh-1)
- [ER 다이어그램](https://www.erdcloud.com/d/Qj7WevNawY3xH7A6c)
- [Git 컨벤션](https://www.notion.so/Git-Convention-31914546aa48442a8029846da66f6e53?pvs=4)
- [Jira 컨벤션](https://www.notion.so/Jira-Convention-9c3867d7c3be4498a53076b61ffee740?pvs=4)
- [API 명세서 및 역할 분담](https://www.notion.so/API-cf4ac4b5bff54b09afc6dc7027fa9fee?pvs=4)
- [트랜잭션 플로우](https://www.notion.so/1f517b2def874d26be277dbb7f783f2c?pvs=4)
- [시스템 아키텍처](https://www.notion.so/1c8235f7857a4776863019086fa9a8b7?pvs=4)
