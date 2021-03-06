## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

[ 피드백 강의 전까지 미션 진행 종료 ]

---
# 자동차 경주 게임 다시 구현

## 기능 요구사항
각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
자동차 이름은 쉼표(,)를 기준으로 구분한다.
전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.

[실행결과]

위 요구사항에 따라 3대의 자동차가 5번 움직였을 경우 프로그램을 실행한 결과는 다음과 같다.
```
경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
crong : -
honux : -

pobi : --
crong : -
honux : --

pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : ----

pobi : -----
crong : ----
honux : -----

pobi : -----
crong : ----
honux : -----

pobi, honux가 최종 우승했습니다.
```
---
## 기능 목록 정리
- [X] 자동차 값 입력
    - [X] 글자 수 유효성 체크
    - [X] split 처리
    - [X] 자동차 객체화
- [X] 경주 진행
    - [X] 0~9 랜덤 값 생성
    - [X] 경기 점수 기록
    - [X] 우승자 비교
- [X] 입력 UI
- [X] 출력 UI

## 리팩토링 목록
- [X] 랜덤 수 생성 메소드의 의존 관계 축소
    - [X] 랜덤 수 생성 메소드를 최대한 상위 노드로 끌어 올림
    - [X] 의존 관계가 제거된 메소드 TDD
- [X] 모든 원시값과 문자열을 포장
- [X] 일급콜렉션 사용