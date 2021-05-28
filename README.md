# 숫자 야구게임

---



## TODO LIST

1. 서로 다른 수 3자리의 숫자 생성기
2. 사용자가 입력한 숫자와 생성된 숫자 비교
3. 비교에 따른 힌트 출력



## 서로 다른 수 3자리 숫자 생성기

- [x] 만들어진 배열 [1,2,3,4,5,6,7,8,9]

- [x] Collections.shuffle 을 사용

- [x] 무작위로 정렬된 리스트에서 앞 원소부터 3 개를 가져온다.

- [x] 3가지 원소를 다시 새로운 리스트에 담는다.

-추가-

새로운 리스트가 아닌 일급 컬렉션을 만들어

추후 사용자가 입력한 숫자와  비교하여 판단할 수 있는 일급 컬렉션을 만든다.



## 사용자가 입력한 숫자와 생성된 숫자 비교

1. Scanner  nextInt() 메소드를 통해  ex) 123  입력을 받으면
2. [1,2,3] 변환
3. for 문을 돌면서 랜덤으로 생성된 list.contains(입력 값)
4. 만약 true 라면
5. 순서까지 일치하는지 비교 - > ture
   스트라이크 카운트 증가
6. 순서가 다르다면
   볼 카운트 증가
7. 같은게 없다면 -> 낫싱 출력



## 비교에 따른 힌트 출력

1. 

