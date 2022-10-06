# spring-api-app
인프런 강의 - 생산성을 향상시키는 스프링부트 기반의 API 템플릿 프로젝트 구현


### 패키지 구조 설계 - 도메인형 패키지 구조
```
── java
   └── com
       └── app
           ├── api
           ├── domain
           ├── global
           │   ├── config
           │   ├── error
           │   ├── interceptor
           │   ├── jwt
           │   ├── resolver
           │   └── util
           ├── infra
           └── web

```

- 도메인별로 응집
- 유지보수 편리
