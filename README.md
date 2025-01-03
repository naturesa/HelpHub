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
1. Open the frontend folder with VS Code
2. Run index.html with live server plugin
   
### Configuration:
Make sure to configure your MySQL database with the proper settings (username, password, etc.), or use the H2 database for development.

## Screenshots
### Homepage

![homepage](https://github.com/user-attachments/assets/34a6fa93-b39f-4e19-8d75-2ef76df78ed2)

Registration Page

![regist](https://github.com/user-attachments/assets/24af52ad-b54e-4974-8ea1-157338cd7acc)

Volunteer Profile Cards
![vol](https://github.com/user-attachments/assets/a2253400-6528-45d6-9ee4-1fbc12137a5e)


InNeed Profile Cards
![Screenshot from 2025-01-02 10-19-09](https://github.com/user-attachments/assets/6fab8c1d-0006-4d13-a14b-9fa5fee6d68a)


Authors and Acknowledgements
This project was developed by:

@lucastakase- Dependency and Plugin Configuration, JavaScript Integration
@naturesa- Frontend Development (HTML, CSS, JavaScript)
@Silverworm1991- Backend Development
@V.msm- Backend Development
I would like to thank Code for All, the Mastercoders, our fellow bootcamp colleagues, and everyone who supported us during the development of this project.

Special thanks to the people who helped us refine this idea!
