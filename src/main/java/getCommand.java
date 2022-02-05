import java.util.Scanner;

public class getCommand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select table:");
        System.out.println("1. action");
        System.out.println("2. author");
        System.out.println("3. author_role");
        System.out.println("4. bookkeeping");
        System.out.println("5. books");
        System.out.println("6. book_author");
        System.out.println("7. book_category");
        System.out.println("8. category");
        System.out.println("9. order_db");
        System.out.println("10. role");
        System.out.println("11. user");
        int sTable = scanner.nextInt();

        if (sTable == 1) {
            System.out.println("Table structure: \n" +
                    "   CREATE TABLE `action` (\n" +
                    "       `act_id` int(11) NOT NULL,\n" +
                    "       `name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL\n" +
                    "   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;");
            System.out.println("Table index: \n" +
                    "   ALTER TABLE `action`\n"+
                    "       ADD PRIMARY KEY (`act_id`);");
            System.out.println("AUTO_INCREMENT for table: \n" +
                    "   ALTER TABLE `action`\n" +
                    "       MODIFY `act_id` int(11) NOT NULL AUTO_INCREMENT;");
        } else if (sTable == 2) {
            System.out.println("Table structure: \n" +
                    "   CREATE TABLE `author` (\n" +
                    "       `author_id` int(11) NOT NULL,\n" +
                    "       `first_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\n" +
                    "       `author_role_id` int(11) DEFAULT NULL,\n" +
                    "       `last_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL\n" +
                    "   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;");
            System.out.println("Table index: \n" +
                    "   ALTER TABLE `author`\n" +
                    "       ADD PRIMARY KEY (`author_id`),\n" +
                    "       ADD KEY `author_id` (`author_id`),\n" +
                    "       ADD KEY `author_ibfk_1` (`author_role_id`);");
            System.out.println("AUTO_INCREMENT for table: \n" +
                    "   ALTER TABLE `author`\n" +
                    "       MODIFY `author_id` int(11) NOT NULL AUTO_INCREMENT;");
            System.out.println("FOREIGN KEY for table: \n" +
                    "   ALTER TABLE `author`\n" +
                    "       ADD CONSTRAINT `author_ibfk_1` FOREIGN KEY (`author_role_id`) REFERENCES `author_role` (`author_role_id`);");
        } else if (sTable == 3) {
            System.out.println("Table structure: \n" +
                    "   CREATE TABLE `author_role` (\n" +
                    "       `author_role_id` int(11) NOT NULL,\n" +
                    "       `role_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL\n" +
                    "   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;");
            System.out.println("Table index: \n" +
                    "   ALTER TABLE `author_role`\n" +
                    "       ADD PRIMARY KEY (`author_role_id`),\n" +
                    "       ADD KEY `author_role_id` (`author_role_id`);");
            System.out.println("AUTO_INCREMENT for table: \n" +
                    "   ALTER TABLE `author_role`\n" +
                    "       MODIFY `author_role_id` int(11) NOT NULL AUTO_INCREMENT;");
        } else if (sTable == 4) {
            System.out.println("Table structure: \n" +
                    "   CREATE TABLE `bookkeeping` (\n" +
                    "       `reg_id` int(11) NOT NULL,\n" +
                    "       `book_id` int(11) DEFAULT NULL,\n" +
                    "       `act_id` int(11) DEFAULT NULL,\n" +
                    "       `total_quantity` int(11) DEFAULT NULL,\n" +
                    "       `in_reading` int(11) DEFAULT NULL,\n" +
                    "       `remain` int(11) DEFAULT NULL\n" +
                    "   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;");
            System.out.println("Table index: \n" +
                    "   ALTER TABLE `bookkeeping`\n" +
                    "       ADD PRIMARY KEY (`reg_id`),\n" +
                    "       ADD KEY `book_id` (`book_id`,`act_id`),\n" +
                    "       ADD KEY `act_id` (`act_id`);");
            System.out.println("AUTO_INCREMENT for table: \n" +
                    "   ALTER TABLE `bookkeeping`\n" +
                    "       MODIFY `reg_id` int(11) NOT NULL AUTO_INCREMENT;");
            System.out.println("FOREIGN KEY for table: \n" +
                    "   ALTER TABLE `bookkeeping`\n" +
                    "       ADD CONSTRAINT `bookkeeping_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`),\n" +
                    "       ADD CONSTRAINT `bookkeeping_ibfk_2` FOREIGN KEY (`act_id`) REFERENCES `action` (`act_id`);");
        } else if (sTable == 5) {
            System.out.println("Table structure: \n" +
                    "   CREATE TABLE `books` (\n" +
                    "       `book_id` int(11) NOT NULL,\n" +
                    "       `title` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\n" +
                    "       `description` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\n" +
                    "       `release_year` int(11) DEFAULT NULL,\n" +
                    "       `rate` double(10,0) DEFAULT NULL\n" +
                    "   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;");
            System.out.println("Table index: \n" +
                    "   ALTER TABLE `books`\n" +
                    "       ADD PRIMARY KEY (`book_id`),\n" +
                    "       ADD KEY `book_id` (`book_id`);");
            System.out.println("AUTO_INCREMENT for table: \n" +
                    "   ALTER TABLE `books`\n" +
                    "       MODIFY `book_id` int(11) NOT NULL AUTO_INCREMENT;");
        } else if (sTable == 6) {
            System.out.println("Table structure: \n" +
                    "   CREATE TABLE `book_author` (\n" +
                    "       `author_id` int(11) DEFAULT NULL,\n" +
                    "       `book_id` int(11) DEFAULT NULL,\n" +
                    "       `last_update` timestamp NULL DEFAULT NULL\n" +
                    "   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;");
            System.out.println("Table index: \n" +
                    "   ALTER TABLE `book_author`\n" +
                    "       ADD KEY `book_id` (`book_id`),\n" +
                    "       ADD KEY `book_author_ibfk_1` (`author_id`);");
            System.out.println("FOREIGN KEY for table: \n" +
                    "   ALTER TABLE `book_author`\n" +
                    "       ADD CONSTRAINT `book_author_ibfk_1` FOREIGN KEY (`author_id`) REFERENCES `author` (`author_id`),\n" +
                    "       ADD CONSTRAINT `book_author_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`);");
        } else if (sTable == 7) {
            System.out.println("Table structure: \n" +
                    "   CREATE TABLE `book_category` (\n" +
                    "       `book_id` int(11) DEFAULT NULL,\n" +
                    "       `category_id` int(11) DEFAULT NULL,\n" +
                    "       `last_update` timestamp NULL DEFAULT NULL\n" +
                    "   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;");
            System.out.println("Table index: \n" +
                    "   ALTER TABLE `book_category`\n" +
                    "       ADD KEY `book_id` (`book_id`),\n" +
                    "       ADD KEY `category_id` (`category_id`);\n");
            System.out.println("FOREIGN KEY for table: \n" +
                    "   ALTER TABLE `book_category`\n" +
                    "       ADD CONSTRAINT `book_category_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`),\n" +
                    "       ADD CONSTRAINT `book_category_ibfk_2` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`);");
        } else if (sTable == 8) {
            System.out.println("Table structure: \n" +
                    "   CREATE TABLE `category` (\n" +
                    "       `category_id` int(11) NOT NULL,\n" +
                    "       `name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\n" +
                    "       `last_update` timestamp NULL DEFAULT NULL\n" +
                    "   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;");
            System.out.println("Table index: \n" +
                    "   ALTER TABLE `category`\n" +
                    "       ADD PRIMARY KEY (`category_id`);");
            System.out.println("AUTO_INCREMENT for table: \n" +
                    "   ALTER TABLE `category`\n" +
                    "       MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT;");
        } else if (sTable == 9) {
            System.out.println("Table structure: \n" +
                    "   CREATE TABLE `order_db` (\n" +
                    "       `order_id` int(11) NOT NULL,\n" +
                    "       `book_id` int(11) DEFAULT NULL,\n" +
                    "       `user_id` int(11) DEFAULT NULL,\n" +
                    "       `start_date` timestamp NULL DEFAULT NULL,\n" +
                    "       `return_date` timestamp NULL DEFAULT NULL\n" +
                    "   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;");
            System.out.println("Table index: \n" +
                    "   ALTER TABLE `order_db`\n" +
                    "       ADD PRIMARY KEY (`order_id`),\n" +
                    "       ADD KEY `book_id` (`book_id`,`user_id`),\n" +
                    "       ADD KEY `user_id` (`user_id`);");
            System.out.println("AUTO_INCREMENT for table: \n" +
                    "   ALTER TABLE `order_db`\n" +
                    "       MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT;");
            System.out.println("FOREIGN KEY for table: \n" +
                    "   ALTER TABLE `order_db`\n" +
                    "       ADD CONSTRAINT `order_db_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`),\n" +
                    "       ADD CONSTRAINT `order_db_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);");
        } else if (sTable == 10) {
            System.out.println("Table structure: \n" +
                    "   CREATE TABLE `role` (\n" +
                    "       `role_id` int(11) NOT NULL,\n" +
                    "       `name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL\n" +
                    "   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;");
            System.out.println("Table index: \n" +
                    "   ALTER TABLE `role`\n" +
                    "       ADD PRIMARY KEY (`role_id`),\n" +
                    "       ADD KEY `role_id` (`role_id`);");
            System.out.println("AUTO_INCREMENT for table: \n" +
                    "   ALTER TABLE `role`\n" +
                    "       MODIFY `role_id` int(11) NOT NULL AUTO_INCREMENT;");
        } else if (sTable == 11) {
            System.out.println("Table structure: \n" +
                    "   CREATE TABLE `user` (\n" +
                    "       `user_id` int(11) NOT NULL,\n" +
                    "       `first_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\n" +
                    "       `role_id` int(11) DEFAULT NULL,\n" +
                    "       `last_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\n" +
                    "       `email` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\n" +
                    "       `password` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\n" +
                    "       `dob` date DEFAULT NULL,\n" +
                    "       `registration_date` timestamp NULL DEFAULT current_timestamp()\n" +
                    "   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;");
            System.out.println("Table index: \n" +
                    "   ALTER TABLE `user`\n" +
                    "       ADD PRIMARY KEY (`user_id`),\n" +
                    "       ADD KEY `role_id` (`role_id`),\n" +
                    "       ADD KEY `role_id_2` (`role_id`);\n");
            System.out.println("AUTO_INCREMENT for table: \n" +
                    "   ALTER TABLE `user`\n" +
                    "       MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT;");
            System.out.println("FOREIGN KEY for table: \n" +
                    "   ALTER TABLE `user`\n" +
                    "       ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`);\n" +
                    "   COMMIT;");
        } else {
            System.out.println("Wrong input!");
        }
    }
}
