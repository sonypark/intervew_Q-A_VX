'''
소수 판별 함수 만들기
소수란 1과 자기 자신으로만 나눠지는 수
2, 3, 5, 7, 11, 13, 17, 19, 23 등

목적: 입력값 N이 들어왔을 때 소수인지 아닌지 판별
'''


'''
방법1
N=1이면 소수 아님
N=2이면 소수

2부터 N-1까지의 수로 나눴을 때 나머지가 0이 되는 수가 있으면 소수 아님 
'''
def prime(n:int) ->bool:
    if n <2:
        return False

    for i in range(2,n):
        if(n%i ==0):
            return False
    return True



'''
방법2
N=2이면 소수
N을 2로 나누었을 때 나머지가 0이면 소수 아님
-- 홀수만 남음 --
N-1이하의 홀수로 나눴을 때 나머지가 0이 되는 수가 있으면 소수 아님
'''

def prime_2(n:int) ->bool:
    if n==1:
        return False
    if n==2:
        return True
    if n%2 ==0:
        return False
    for i in range(3, n, 2):

        if(n%i ==0):
            return False
    return True


'''
방법3
N의 제곱근까지만 나누어 0이 되는 수가 있으면 소수 아님
'''
import math

def prime_3(n:int)->bool:
    if n==1:
        return False
    if n==2:
        return True
    if n%2 ==0:
        return False

    # 실수이므로 반올림 해준다.
    R = round(math.sqrt(n))+1  # math 이용
    # R = round(n**0.5)+1 # ** 연산을 통한 루트 이용
    for i in range(3, R, 2):
        if(n%i==0):
            return False
    return True


#입력값 n 이하에 있는 모든 소수 출력
for p in range(30):
    #방법1
    if(prime(p)):
        print(p)
    #방법2
    if(prime_2(p)):
        print(p)
    #방법3
    if(prime_3(p)):
        print(p)
