package session16.miniProject;

import java.util.List;
import java.util.Scanner;

public class PetKingdomApp {
    private static final Scanner scanner = new Scanner(System.in);

    private final PetInventory<Pet> petInventory = new PetInventory<>();
    private final CustomerManager<Customer> customerManager = new CustomerManager<>();
    private final SpaQueueManager<SpaTicket> spaQueueManager = new SpaQueueManager<>();
    private final ActivityLog<ActionLogEntry> activityLog = new ActivityLog<>();

    public static void main(String[] args) {
        PetKingdomApp app = new PetKingdomApp();
        app.run();
    }

    private void run() {
        boolean exit = false;
        while (!exit) {
            showMainMenu();
            int choice = getIntInput("Chọn chức năng: ");

            switch (choice) {
                case 1:
                    petManagementMenu();
                    break;
                case 2:
                    customerManagementMenu();
                    break;
                case 3:
                    spaServiceMenu();
                    break;
                case 4:
                    activityLogMenu();
                    break;
                case 0:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    exit = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }

    private void showMainMenu() {
        System.out.println("================ PET KINGDOM ================");
        System.out.println("1. Quản lý kho thú cưng");
        System.out.println("2. Quản lý khách hàng thân thiết");
        System.out.println("3. Quản lý dịch vụ Spa");
        System.out.println("4. Nhật ký hoạt động gần đây");
        System.out.println("0. Thoát");
        System.out.println("=============================================");
    }

    private void petManagementMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("======== QUẢN LÝ KHO THÚ CƯNG ========");
            System.out.println("1. Thêm mới thú cưng");
            System.out.println("2. Hiển thị danh sách thú cưng");
            System.out.println("3. Tìm kiếm thú cưng theo ID");
            System.out.println("4. Xóa thú cưng (đã bán)");
            System.out.println("0. Quay lại menu chính");
            System.out.println("======================================");
            int choice = getIntInput("Chọn chức năng: ");

            switch (choice) {
                case 1:
                    addNewPet();
                    break;
                case 2:
                    showAllPets();
                    break;
                case 3:
                    searchPetById();
                    break;
                case 4:
                    removePet();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }

    private void customerManagementMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("=== QUẢN LÝ KHÁCH HÀNG THÂN THIẾT ===");
            System.out.println("1. Đăng ký khách hàng thành viên mới");
            System.out.println("2. Hiển thị danh sách khách hàng");
            System.out.println("3. Tra cứu khách hàng theo mã khách hàng");
            System.out.println("0. Quay lại menu chính");
            System.out.println("=====================================");
            int choice = getIntInput("Chọn chức năng: ");

            switch (choice) {
                case 1:
                    registerCustomer();
                    break;
                case 2:
                    showAllCustomers();
                    break;
                case 3:
                    searchCustomerById();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }

    private void spaServiceMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("======== QUẢN LÝ DỊCH VỤ SPA ========");
            System.out.println("1. Tiếp nhận thú cưng vào hàng đợi Spa");
            System.out.println("2. Xử lý thú cưng tiếp theo trong hàng đợi");
            System.out.println("3. Xem danh sách chờ Spa");
            System.out.println("0. Quay lại menu chính");
            System.out.println("=====================================");
            int choice = getIntInput("Chọn chức năng: ");

            switch (choice) {
                case 1:
                    enqueueSpaPet();
                    break;
                case 2:
                    processNextSpaPet();
                    break;
                case 3:
                    showSpaQueue();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }

    private void activityLogMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("====== NHẬT KÝ HOẠT ĐỘNG GẦN ĐÂY ======");
            System.out.println("1. Xem hành động gần nhất");
            System.out.println("2. Hoàn tác (Undo) hành động gần nhất");
            System.out.println("3. Xem toàn bộ nhật ký hoạt động");
            System.out.println("0. Quay lại menu chính");
            System.out.println("=======================================");
            int choice = getIntInput("Chọn chức năng: ");

            switch (choice) {
                case 1:
                    viewLastAction();
                    break;
                case 2:
                    undoLastAction();
                    break;
                case 3:
                    showAllActions();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }

    private int getIntInput(String message) {
        while (true) {
            System.out.print(message);
            String line = scanner.nextLine();
            try {
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
            }
        }
    }

    private double getDoubleInput(String message) {
        while (true) {
            System.out.print(message);
            String line = scanner.nextLine();
            try {
                return Double.parseDouble(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số thực hợp lệ.");
            }
        }
    }

    private String getStringInput(String message) {
        System.out.print(message);
        return scanner.nextLine().trim();
    }

    private void addNewPet() {
        System.out.println("=== THÊM MỚI THÚ CƯNG ===");
        String id = getStringInput("Nhập ID: ");
        String name = getStringInput("Nhập tên: ");
        String species = getStringInput("Nhập loài (vd: Dog, Cat): ");
        String breed = getStringInput("Nhập giống: ");
        int age = getIntInput("Nhập tuổi: ");
        double price = getDoubleInput("Nhập giá bán: ");

        if (petInventory.findById(id) != null) {
            System.out.println("ID thú cưng đã tồn tại, không thể thêm.");
            return;
        }

        Pet pet = new Pet(id, name, species, breed, age, price);
        petInventory.add(pet);
        System.out.println("Đã thêm thú cưng thành công.");

        activityLog.push(new ActionLogEntry("Thêm thú cưng mới: " + pet));
    }

    private void showAllPets() {
        System.out.println("=== DANH SÁCH THÚ CƯNG ===");
        List<Pet> pets = petInventory.getAll();
        if (pets.isEmpty()) {
            System.out.println("Kho thú cưng đang trống.");
            return;
        }
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    private void searchPetById() {
        String id = getStringInput("Nhập ID thú cưng cần tìm: ");
        Pet pet = petInventory.findById(id);
        if (pet == null) {
            System.out.println("Không tìm thấy thú cưng với ID: " + id);
        } else {
            System.out.println("Thông tin thú cưng: " + pet);
        }
    }

    private void removePet() {
        String id = getStringInput("Nhập ID thú cưng cần xóa (đã bán): ");
        Pet pet = petInventory.findById(id);
        if (pet == null) {
            System.out.println("Không tìm thấy thú cưng với ID: " + id);
            return;
        }
        boolean removed = petInventory.removeById(id);
        if (removed) {
            System.out.println("Đã xóa thú cưng khỏi kho.");
            activityLog.push(new ActionLogEntry("Xóa thú cưng (đã bán): " + pet));
        } else {
            System.out.println("Xóa thất bại.");
        }
    }

    private void registerCustomer() {
        System.out.println("=== ĐĂNG KÝ KHÁCH HÀNG THÀNH VIÊN MỚI ===");
        String id = getStringInput("Nhập mã khách hàng: ");
        String name = getStringInput("Nhập tên khách hàng: ");
        String phone = getStringInput("Nhập số điện thoại: ");
        String email = getStringInput("Nhập email: ");

        Customer customer = new Customer(id, name, phone, email);
        boolean success = customerManager.register(customer);
        if (success) {
            System.out.println("Đăng ký khách hàng thành công.");
            activityLog.push(new ActionLogEntry("Đăng ký khách hàng mới: " + customer));
        } else {
            System.out.println("Đăng ký thất bại. Có thể mã khách hàng hoặc số điện thoại đã tồn tại.");
        }
    }

    private void showAllCustomers() {
        System.out.println("=== DANH SÁCH KHÁCH HÀNG ===");
        if (customerManager.getAll().isEmpty()) {
            System.out.println("Chưa có khách hàng nào.");
            return;
        }
        for (Customer customer : customerManager.getAll()) {
            System.out.println(customer);
        }
    }

    private void searchCustomerById() {
        String id = getStringInput("Nhập mã khách hàng cần tra cứu: ");
        Customer customer = customerManager.findById(id);
        if (customer == null) {
            System.out.println("Không tìm thấy khách hàng với mã: " + id);
        } else {
            System.out.println("Thông tin khách hàng: " + customer);
        }
    }

    private void enqueueSpaPet() {
        System.out.println("=== TIẾP NHẬN THÚ CƯNG VÀO HÀNG ĐỢI SPA ===");
        String customerId = getStringInput("Nhập mã khách hàng: ");
        Customer customer = customerManager.findById(customerId);
        if (customer == null) {
            System.out.println("Không tìm thấy khách hàng. Vui lòng đăng ký khách hàng trước.");
            return;
        }

        String petId = getStringInput("Nhập ID thú cưng sẽ làm Spa: ");
        Pet pet = petInventory.findById(petId);
        if (pet == null) {
            System.out.println("Không tìm thấy thú cưng trong kho với ID: " + petId);
            return;
        }

        String serviceDesc = getStringInput("Nhập mô tả dịch vụ Spa (vd: Tắm, Cắt tỉa lông...): ");
        String ticketId = "SPA-" + System.currentTimeMillis();
        SpaTicket ticket = new SpaTicket(ticketId, pet, customer, serviceDesc);
        spaQueueManager.enqueue(ticket);

        System.out.println("Đã thêm vào hàng đợi Spa với mã phiếu: " + ticketId);
        activityLog.push(new ActionLogEntry("Tiếp nhận Spa: " + ticket));
    }

    private void processNextSpaPet() {
        System.out.println("=== XỬ LÝ THÚ CƯNG TIẾP THEO TRONG HÀNG ĐỢI SPA ===");
        SpaTicket next = spaQueueManager.dequeue();
        if (next == null) {
            System.out.println("Không có thú cưng nào trong hàng đợi Spa.");
        } else {
            System.out.println("Đang xử lý Spa cho: " + next);
            activityLog.push(new ActionLogEntry("Xử lý xong dịch vụ Spa cho: " + next));
        }
    }

    private void showSpaQueue() {
        System.out.println("=== DANH SÁCH CHỜ SPA ===");
        List<SpaTicket> tickets = spaQueueManager.toList();
        if (tickets.isEmpty()) {
            System.out.println("Hiện không có thú cưng nào trong hàng đợi Spa.");
            return;
        }
        for (SpaTicket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    private void viewLastAction() {
        System.out.println("=== HÀNH ĐỘNG GẦN NHẤT ===");
        ActionLogEntry last = activityLog.peek();
        if (last == null) {
            System.out.println("Chưa có hành động nào được ghi nhận.");
        } else {
            System.out.println(last);
        }
    }

    private void undoLastAction() {
        System.out.println("=== HOÀN TÁC (UNDO) HÀNH ĐỘNG GẦN NHẤT ===");
        ActionLogEntry last = activityLog.pop();
        if (last == null) {
            System.out.println("Không còn hành động nào để hoàn tác.");
        } else {
            System.out.println("Đã lấy ra hành động: " + last);
        }
    }

    private void showAllActions() {
        System.out.println("=== TOÀN BỘ NHẬT KÝ HOẠT ĐỘNG ===");
        if (activityLog.isEmpty()) {
            System.out.println("Nhật ký trống.");
            return;
        }
        for (ActionLogEntry entry : activityLog.getAll()) {
            System.out.println(entry);
        }
    }
}

