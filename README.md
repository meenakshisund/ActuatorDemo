# ActuatorDemo

Actuator has endpoints like /info, /health, /env, /metrics. 

By default only /info and /health are enabled for web. We need to include other endpoints if neede using this property

management.endpoints.web.exposure.include=info,health,metrics,env

To use:

http://localhost:8080/actuator/info
http://localhost:8080/actuator/health
http://localhost:8080/actuator/metrics - This lists down the properties that can be hit again to fetch details.

Ex: http://localhost:8080/actuator/metrics/system.cpu.count

References:
1. https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#production-ready
2. https://www.baeldung.com/spring-boot-actuators
