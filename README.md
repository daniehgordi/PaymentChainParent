# DESCRIPCION PROYECTO PAYMENTCHAIN
Aquí hemos desarrollado un proyecto de microservicios utilizando Spring Boot y Spring Cloud, incluyendo Netflix Eureka, Spring Config, 
Spring Admin, API Gateway, Spring WebFlux y sobretodo la seguridad de las APIs con Spring Security y OAuth2. (Antualmente en proces)

Hemos diseñado una arquitectura propia compuesta por:
Modulo padre (paymentchainparent)
Modulo hijo 1 (businessdomain) que es la parte dedicada a negocio.
Modulo hijo 2 (infraestructuradomain) que es la parte de administracion, configuración y servidor.

El desarrollo de los microservicios hemos mantenido la misma estructura de paquetes:
- repository, controller, entity, ademas del paquete principal.
- 
También hemos utilizado Docker para probar e implementar la aplicación de manera rápida a través
de los contenedores.


