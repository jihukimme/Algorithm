def solution(bin1, bin2):
    # 1. 이진수 문자열을 정수로 변환
    decimal_sum = int(bin1, 2) + int(bin2, 2)
    
    # 2. 정수를 이진수 문자열로 변환
    return bin(decimal_sum)[2:]
