# Automation Test
> El objetivo de esta automatización es testear la ortografía de 3 secciones.

<img src="https://img.shields.io/badge/maven-version%203.6.3-blue" alt="Maven version 3.6.3"></a>
<img src="https://img.shields.io/badge/build-success-brightgreen" alt="Hardcoding de build succes por falta de servidor"></a>

El proyecto usa las siguientes tecnologias:
* Maven 3.6.3
* TestNG 6.8
* Selenium WebDriver 3.141.59

Está basado en el patrón de diseño:
- Java - Page object model
- Selenium - PageFactory model

Localmente los test se inician en:
- Jenkins
- maven test pom.xml
- TestNG.XML

## Pre-requisitos e Instalación

* Es necesario una versión de maven 3.6.3 o superior para ejecutar la prueba localmente.
* Tambien es posible ejecutarlo directamente desde un servidor/maquina con jenkins instalado:

![Jenkins_conexion](https://i.ibb.co/94JSgvX/jen-1.png)
![Jenkins_conexion](https://i.ibb.co/rQSbyZ3/jen-2.png)

## Ejecución

El proyecto inicia en la carpeta raíz con el comando:

```bash
mvn clean test
```

## Objetivos

El test busca en 3 secciones que una palabra esté bien escrita.

* Seguros > Autos
![Seguro_autos](https://i.ibb.co/Yb5yhQc/experta-seguros.png)

* Servicios > Denuncia siniestros
![Denuncia_siniestros](https://i.ibb.co/G03CDSy/experta-denuncia-Siniestros.png)

* Productores
![Sumamos](https://i.ibb.co/whrwLd4/experta-productores.png)



## CI/CD

Jenkins es usado localmente en este proyecto para integración contínua basado en la escucha de commits en este repositorio.

![Jenkins_ejecucion](https://i.ibb.co/DtvFzyP/automation.gif)

## Cross Browser Testing

La ejecución del proyecto es apto para Chrome, Internet Explorer, Mozilla Firefox. Por fines de rendimiento se pre-estableció iniciar con Chrome Browser.

El mismo puede cambiarse en `./TestNG.xml` modificando `value="chrome"`:

```xml
<test name="Text Check">
	<parameter name="browser" value="chrome" />
	<classes>
		<class name="com.testing.experta.testCases.TC_CheckText_Seguros_001" />
		<class name="com.testing.experta.testCases.TC_CheckText_Productores_001" />
		<class name="com.testing.experta.testCases.TC_CheckText_Servicios_001" />
	</classes>
</test>
```

## Reportes

Despues de cada ejecución, se crea un reporte en `AutomationTest/test-output/Test-Report-fecha.html`
El mismo html se puede ejecutar manualmente para verificar resultados.

![Reportes](https://i.ibb.co/sjFbZK0/reportes.png)


## TODO
- [ ] Dockerizar Jenkins.
- [ ] Dockerizar selenium standalone para ejecucion en cross browser desde contenedor.
- [ ] Crear composer.


### License  <img src="https://img.shields.io/badge/licence-Apache%202-yellowgreen" alt="licence-Apache-2"></a>
