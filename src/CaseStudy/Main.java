package CaseStudy;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library admin = new Library();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---------------------------");
            System.out.println("1.Xem danh sách.");
            System.out.println("2.Thêm sách");
            System.out.println("3.Cập nhật sách");
            System.out.println("4.Xóa sách");
            System.out.println("5.Sắp xếp sách.");
            System.out.println("6. Thoat.");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    admin.display();
                    break;
                case 2:
                    System.out.print("Nhập id: ");
                    String id = new Scanner(System.in).nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String title = new Scanner(System.in).nextLine();
                    System.out.print("Nhập Tác giả: ");
                    String author = new Scanner(System.in).nextLine();
                    System.out.print("Nhập năm sản xuất: ");
                    int publishingYear = new Scanner(System.in).nextInt();
                    System.out.print("Nhập thể loại: ");
                    String genre = new Scanner(System.in).nextLine();
                    System.out.print("Nhập kích thước tệp: ");
                    double size = new Scanner(System.in).nextDouble();
                    System.out.print("Nhập đnh dạng tệp: ");
                    String format = new Scanner(System.in).nextLine();
                    admin.addEbook(new Ebook(id, title, author, publishingYear, genre, size, format));
                    break;
                case 3:
                    System.out.print("Nhập id cuốn sách cần cập nhật thông tin: ");
                    String updateId = sc.nextLine();
                    if (!admin.isExist(updateId)) {
                        System.out.println("Không có cuốn sách đó trong thư viện.");
                        break;
                    }
                    System.out.println("1. Cập nhật tiêu đề.");
                    System.out.println("2. Cập nhật tác giả.");
                    System.out.println("3. Cập nhật năm xuất bản.");
                    System.out.println("4. Hủy");
                    int updateChoice = sc.nextInt();
                    switch (updateChoice) {
                        case 1:
                            System.out.print("Nhập tiêu đề mới: ");
                            admin.updateTitle(updateId, sc.nextLine());
                            break;
                        case 2:
                            System.out.print("Nhập tác giả mới: ");
                            admin.updateAuthor(updateId, sc.nextLine());
                            break;
                        case 3:
                            System.out.print("Nhập năm xuất bản mới: ");
                            admin.updatePublishingYear(updateId, sc.nextLine());
                            break;
                        case 4:
                            return;
                    }
                    break;
                case 4:
                    System.out.print("Nhập id cuốn sách muon xoa: ");
                    String removeId = sc.nextLine();
                    if (!admin.isExist(removeId)) {
                        System.out.println("Không có cuốn sách đó trong thư viện.");
                        break;
                    }
                    admin.removeBook(removeId);
                    break;
                case 5:
                    System.out.println("1. Sắp xếp theo tiêu đề.");
                    System.out.println("2. Sắp xếp theo tác giả.");
                    System.out.println("3. Sắp xếp theo năm xuất bản.");
                    System.out.println("4. Hủy");
                    int sortChoice = sc.nextInt();
                    switch (sortChoice) {
                        case 1:
                            admin.sortByTitle(true);
                            break;
                        case 2:
                            admin.sortByAuthor(true);
                            break;
                        case 3:
                            admin.sortByPublishingYear(true);
                            break;
                        case 4:
                            return;
                    }
                    break;
                case 6:
                    return;
            }
        } while (true);

    }
}
