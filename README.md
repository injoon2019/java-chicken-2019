# 우아한테크코스 3기 프리코스 오프라인 코딩테스트 대비 
### 치킨 포스기 미션
- 치킨집 사장님이 사용하는 포스(POS) 프로그램을 구현한다. 

<br>

## 🚀 기능 요구사항

1. [주문등록] 
    1. 테이블들을 보여준다. 테이블은 테이블 번호를 가진다. 
    2. 메뉴 기본 정보가 주어지며 메뉴 번호, 종류, 이름, 가격을 가진다.
    3. 테이블의 주문을 받는다.
            1. 최대 수량이 99개 초과일시 예외를 발생 시킨다.
    4. 주문이 등록된 테이블은, 테이블 목록에 별도로 표시를 한다. 

2. [결제하기]
    1. 주문 내역을 보여준다
    2. 치킨 종류 메뉴의 수량 합이 10개가 넘는 경우 10,000원씩 할인한다.
    3. 신용 카드로 결제할 것인지, 현금으로 결제할 것인지 입력 받는다.
    4. 현금 결제일 경우 할인된 금액에서 5% 추가할인을 한다.
    5. 주문 혹은 결제가 불가능할 경우 그 이유를 보여 주고, 다시 주문 혹은 결제가 가능하도록 한다.
    6. 최종 결제 금액을 보여준다. 

3. [프로그램 종료]
    1. 프로그램을 종료한다. 
