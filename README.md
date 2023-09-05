## DB 연결 정보 (AWS 환경변수 가져오기)
![](/note/DB-info.png)

## Workbench로 관리자 접속
```txt
아이디 : metacoding
비번 : metacoding1234
url : rds 호스트 주소
```

## 데이터베이스 생성
```sql
CREATE DATABASE metadb;
```

## 데이터베이스 선택
```sql
USE metadb;
```

## 테이블 생성
```sql
CREATE TABLE book_tb (
 id INTEGER AUTO_INCREMENT PRIMARY KEY,
 title VARCHAR(255),
 content VARCHAR(255),
 author VARCHAR(255)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
```
