# Conversor de Moneda

![Portada](portada.png)

## Insignias

![Java](https://img.shields.io/badge/Java-11%2B-blue)
![Maven](https://img.shields.io/badge/Maven-3.6.3%2B-brightgreen)
![GSON](https://img.shields.io/badge/GSON-2.8.9-yellowgreen)

## Índice

- [Título e imagen de portada](#Título-e-imagen-de-portada)
- [Insignias](#insignias)
- [Índice](#índice)
- [Descripción del proyecto](#descripción-del-proyecto)
- [Estado del proyecto](#Estado-del-proyecto)
- [Características de la aplicación y demostración](#Características-de-la-aplicación-y-demostración)
- [Acceso al proyecto](#acceso-proyecto)
- [Tecnologías utilizadas](#tecnologías-utilizadas)
- [Desarrollador del Proyecto](#personas-desarrolladores)
- [Licencia](#licencia)
- [Conclusión](#conclusión)

## Descripción del proyecto

El Conversor de Moneda es una aplicación en Java que utiliza la librería GSON para manejar conversiones de JSON y la API de Exchange Rate para obtener las tasas de cambio. Permite a los usuarios convertir valores entre diferentes monedas, incluyendo USD, ARS, BOB, BRL, CLP, y COP.

## Estado del proyecto

El proyecto está en fase completada y ha sido probado para asegurar que las conversiones de moneda se realicen correctamente utilizando las tasas de cambio obtenidas de la API.

## Características de la aplicación y demostración

- Conversión de moneda entre USD, ARS, BOB, BRL, CLP, y COP.
- Actualización de tasas de cambio en tiempo real utilizando la API de Exchange Rate.
- Interfaz de línea de comandos fácil de usar.

## Acceso al proyecto

Puedes clonar el repositorio desde GitHub y compilarlo usando Maven:

```sh
git clone https://github.com/tuusuario/conversor-de-moneda.git
cd conversor-de-moneda
mvn clean install
java -jar target/conversor-de-moneda-1.0-SNAPSHOT.jar
```

## Tecnologías utilizadas

- Java 11 o superior
- Maven
- GSON 2.8.9
- API de Exchange Rate

## Desarrollador del Proyecto

- [Ximena Mariel Cruz Tancara](https://github.com/ximenacruz)

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Ver el archivo [LICENSE](LICENSE) para más detalles.

## Conclusión

El Conversor de Moneda es una herramienta útil para convertir valores entre diferentes monedas, utilizando tasas de cambio actualizadas en tiempo real. Es fácil de usar y puede ser ampliado para incluir más monedas según sea necesario.

