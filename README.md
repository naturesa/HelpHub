# HelpHub

HelpHub is a platform designed to connect volunteers with elders or disabled people that are isolated or alone and need a helping hand.

By creating a platform where both volunteers and people in need can register, it enables users to find each other based on their location and specific needs.

This project was developed during the Code for All bootcamp as our final project, with a tight 3-day deadline.

## Features
- **User Registration:** Allows both people in need and volunteers to register on the platform.
- **User Profiles:** Displays user details such as contact information and location.
- **Interactive Cards:** Users can see a list of registered individuals (both volunteers and those in need) in a card view.
- **Search and Filter:** You can search for volunteers based on specific services.

## Technologies Used
- **Backend:** Java, Spring Framework (Spring WebMVC, Spring ORM, Spring TX), Hibernate, MySQL, H2 Database
- **Frontend:** HTML, CSS, JavaScript, Google Maps API
- **Build & Dependency Management:** Maven
- **Server:** Tomcat 8

### Backend Technologies:
- Spring WebMVC (4.3.11.RELEASE)
- Spring ORM (4.3.11.RELEASE)
- Spring TX (4.3.11.RELEASE)
- Hibernate (5.3.6.Final)
- MySQL (8.0.12)
- H2 Database (1.4.196)
- Tomcat Maven Plugin

### Frontend Technologies:
- HTML
- CSS
- JavaScript
- Google Maps API

## How to Run the Project
### Prerequisites:
- Java 8 or higher
- Maven
- MySQL Database
- A new google API key
- VS Code with live server

### Running the Backend:
1. Clone the repository.
2. Navigate to the project folder and open it in your terminal.
3. Run the Maven build command:

   ```bash
   mvn clean install
4. To run the backend locally, use the following Maven command:
   ```bash
mvn tomcat7:deploy

### Running the Frontend:
Open the frontend folder with VS Code
Run index.html with live server plugin
Configuration:
Make sure to configure your MySQL database with the proper settings (username, password, etc.), or use the H2 database for development.
Screenshots
