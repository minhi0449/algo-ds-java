# Java Algorithm & Data Structure Study
> Java 기반 알고리즘 &amp; 자료구조 학습 및 코딩테스트 준비 프로젝트

[![Java](https://img.shields.io/badge/Language-Java-blue.svg)](https://www.oracle.com/java/)
[![Algorithm](https://img.shields.io/badge/Study-Algorithm-red)](#)
[![DataStructure](https://img.shields.io/badge/Study-DataStructure-green)](#)
[![CS Fundamentals](https://img.shields.io/badge/CS-Fundamentals-important)](#)
[![Coding Test](https://img.shields.io/badge/Preparation-CodingTest-yellow)](#)


## 학습 목차
| 챕터 | 주제                  | 세부 내용                                      |
|-----|----------------------|----------------------------------------------|
| ch01 | 기본 알고리즘 | 알고리즘 개요, 시간 복잡도, 공간 복잡도, 논리 연산/드모르간 법칙, 다중 루프 |
| ch02 | 기본 자료구조 | 배열, 연결 리스트, 기본 연산 방법, 난수 생성/소수 나열 |
| ch03 | 검색 알고리즘 | 선형 검색, 이진 검색, 해시 검색, 제네릭스 |
| ch04 | 스택과 큐 | 스택 구현, 큐 구현, 응용 예제(링 버퍼로 큐 만들기) |
| ch05 | 재귀 알고리즘 | 재귀 개념, 팩토리얼, 하노이 탑 문제, 8퀸 문제 |
| ch06 | 정렬 알고리즘 | 버블 정렬, 단순 선택 정렬, 단순삽입, 셸 정렬, 퀵 정렬, 병합 정렬, 힙 정렬, 도수 정렬 |
| ch07 | 문자열 검색 | 브루트-포스 알고리즘, KMP 알고리즘, 보이어-무어 알고리즘 |
| ch08 | 리스트 | 배열 기반 리스트, 포인터 연결 리스트, 배열 커서 연결 리스트, 원형 이중 연결 리스트 |
| ch09 | 트리 | 순서/무순서 트리, 이진 트리, 완전 이진 트리, 이진 검색 트리, 트리 순회 |
| ch10 | 해시 | 해시 테이블, 충돌 해결, 체인법, 해시 함수 설계 |


## 네이밍 규칙 (Naming Convention)

| 항목       | 규칙 예시                          | 설명 |
|-----------|----------------------------------|-----|
| 패키지명  | `ch01.practice`                    | 챕터(ch01~ch10)별로 분리하고, 연습문제는 `practice` 하위 폴더로 구성 |
| 클래스명  | `Q1_Max4`, `Q2_Min3`               | 문제 번호(Qn) + 기능명. 학습용으로 하이브리드 네이밍(Pascal + Snake) 사용 |
| 메서드명  | `max4()`, `min3()`                 | 자바 기본 스타일인 소문자 카멜케이스 사용 |
| 파일경로  | `ch01/practice/Q1_Max4.java`       | 챕터별 연습문제는 전용 practice 폴더에 정리하여 일관된 구조 유지 |

> 본 레포지토리는 학습 목적의 에듀용 저장소입니다.  
> 따라서 **문제 구분 및 가독성을 높이기 위해 하이브리드 네이밍(`Q1_Max4`)을 사용**합니다.  

## 개발 환경
- Java SE Development Kit (JDK) 8 이상
- Eclipse IDE
- 외부 라이브러리 없음 (순수 자바만 사용)
