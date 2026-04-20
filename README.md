📝 Todo Application (Spring Boot + Thymeleaf)A sleek, server-side rendered (SSR) Task Management application built using Spring Boot, Spring Data JPA, and Thymeleaf. This project demonstrates clean MVC architecture and a modern UI/UX for managing daily tasks.🚀 Features✅ Create: Add new todos instantly.✔️ Toggle Completion: Mark tasks as done with visual feedback.🗑️ Delete: Remove tasks from the database.📃 Dynamic List: Real-time view of todos using Thymeleaf templating.🎨 Modern UI: Responsive design using Bootstrap 5 and Google Fonts (Urbanist).⚡ Fast Backend: Optimized performance using Spring Boot.🛠️ Tech StackBackendJava 17+Spring Boot 3.x (Spring MVC, Spring Data JPA)Lombok (Boilerplate reduction)H2 Database (In-memory for easy local testing)FrontendThymeleaf (Template Engine)Bootstrap 5 (Styling Framework)Bootstrap IconsCSS3 (Custom animations and styling)📂 Project StructurePlaintextsrc/main/java/com/example/todo/
├── controller/
│   └── TodoController.java    # Web Routing & Logic
├── entity/
│   └── TodoEntity.java        # Database Schema/Model
└── repository/
    └── TodoRepositories.java  # Data Access Layer (JPA)

src/main/resources/
├── templates/
│   └── index.html             # UI Template
└── static/
    └── css/style.css          # Custom Styles
🔗 Web Routes & LogicMethodEndpointDescriptionPatternGET/Renders Home Page with task listView RenderingPOST/addAdds a new Todo to the databasePost-Redirect-GetGET/update/{id}Toggles 'Completed' statusState ManagementGET/delete/{id}Removes the specific taskData Persistence⚙️ How It WorksPersistence: Data is managed via Spring Data JPA. Even though it's an H2 database by default, the entity is mapped to tbl_todos.State Management: The app uses a boolean flag (completed) to dynamically change UI classes via Thymeleaf's th:classappend.UI Feedback: Completed tasks are visually distinguished with a strikethrough and reduced opacity.▶️ Run Locally1. Clone the repositoryBashgit clone https://github.com/your-username/todo-app.git
cd todo-app
2. Run the applicationUsing the Maven Wrapper:Bash./mvnw spring-boot:run
3. Access in BrowserOpen http://localhost:8080🧠 Future Improvements[ ] Edit Mode: Allow users to update the text of existing tasks.[ ] Search & Filter: Filter by "Active", "Completed", or "All".[ ] User Auth: Add Spring Security for private, user-specific lists.[ ] Due Dates: Integration with a calendar or reminder system.📌 Technical NotesFollows the MVC (Model-View-Controller) design pattern.Uses Lombok's @Builder for clean object instantiation.Implements the Post-Redirect-Get (PRG) pattern to prevent duplicate form submissions on page refresh.📜 LicenseDistributed under the MIT License. See LICENSE for more information.
