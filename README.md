# Spring-Web
코드로 배우는 웹 프로젝트 (Book)
- Maven Project
- Java 1.8 version
- Tomcat 1.9 version
- Spring 5.0.7 version

## Spring Version
- 5.x -> JDK 1.8  
- 4.x -> JDK 1.6
- 3.x -> JDK 1.5
JDK 1.9의 경우 MyBatis 경고 메시지 이슈
  

- Spring 2.5 version  
Annotation을 활용하는 설정을 도입
- Spring 2.5 version  
Java Class만으로 설정 파일을 대신 할 수 있게 지원
- Spring 4.0 version  
REST 방식의 컨트롤러 지원
- Spring 5.0 version  
Reactor를 이용한 Reactive 스타일 지원
  
POJO(Plain Old Java Object) 구성이 가능하도록 제작

## Aspect Oriented Programming (AOP)
보안이나 로그, 트랜잭션과 같은 반드시 처리가 필요한 부분들을 모듈로 분리하는 패러다임.

## Dependency Injection (org.spring.di)
- 의존성 : 하나의 객체가 다른 객체 없이 제대로 된 역할을 할 수 없다는 것  
- 주입 : 외부에서 '밀어 넣는 것'
주입을 받는 입장에서는 어떤 객체인지 쓸 필요없이 편리하게 사용하는 것  
ex) A가 B에게 필요하다는 신호만 보내고, B 객체를 주입하는 것은 외부에서 이루어짐

## Spring Bean
스프링에서 관리되는 객체 <- XML과 Java를 이용하여 처리할 수 있음
- 스프링 프레임워크가 시작되면서 메모리 영역을 만들게 되는데 이를 Context라 한다
- 스프링은 관리해야할 객체들에 대한 설정을 하기위해 @Component라는 어노테이션이 존재하는 클래스의 인스턴스를 생성
- Restaurant 객체는 Chef 객체가 필요하다는 @Autowired 설정으로 Chef -> Restaurant 객체로 주입  
-> 스프링은 관리가 필요한 객체(Bean)를 어노테이션 등을 이용해 객체를 생성하고 관리하는 '컨테이너' 또는 '팩토리' 기능을 가지고 있다
  
## Annotation
- @Data : Lombok에서 제공되며, getter/setter 및 생성자를 자동으로 생성하고 sertter @Autowired 어노테이션을 추가해 준다
- @Logj : Lombok에서 제공되며, log.info를 사용할 수 있게 한다.
- @Component : 해당 클래스가 스프링에서 객체로 만들어서 관리하는 대상임을 명시하는 어노테이션 -> 객체로 생성하여 빈으로 관리
- @Autowired : 스프링 내부에서 자신이 특정한 객체에 의존적이므로 빈을 주입해 달라는 표시  
  -> 스프링 4.3 이후로는 묵시적으로 @Autowired 어노테이션 없이 주입가능
- @ContextConfiguration : 테스트에서 중요하며 어떤 설정 정보를 읽어 들여야 하는지 명시
- @Runwith : 테스트 시 필요한 클래스를 지정 -> 스프링은 SpringJUnit4ClassRunner 클래스 대상
- @Test : junit 상에서 단위 테스트 대상인지 알려줌
- @RequiredArgsConstructor : @NonNull이나 final이 붙은 인스턴스 변수에 대한 생성자를 만들어 냄

