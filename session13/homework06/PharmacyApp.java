package session13.homework06;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PharmacyApp {
    private static final List<Medicine> order = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        boolean running = true;
        while (running) {
            showMenu();
            System.out.print("Chọn (1-6): ");
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    addMedicine();
                    break;
                case "2":
                    adjustQuantity();
                    break;
                case "3":
                    removeMedicine();
                    break;
                case "4":
                    printInvoice();
                    break;
                case "5":
                    findCheapMedicines();
                    break;
                case "6":
                    running = false;
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Thử lại.");
            }
            System.out.println();
        }
    }

    private static void showMenu() {
        System.out.println("===== MENU KÊ ĐƠN THUỐC =====");
        System.out.println("1. Thêm thuốc vào đơn");
        System.out.println("2. Điều chỉnh số lượng (theo mã thuốc)");
        System.out.println("3. Xóa thuốc (theo mã thuốc)");
        System.out.println("4. In hóa đơn và xóa đơn");
        System.out.println("5. Tìm thuốc giá rẻ (đơn giá < 50.000 VNĐ)");
        System.out.println("6. Thoát");
    }

    private static void addMedicine() {
        System.out.print("Nhập mã thuốc: ");
        String id = scanner.nextLine().trim();
        if (id.isEmpty()) {
            System.out.println("Mã thuốc không được để trống.");
            return;
        }

        System.out.print("Nhập tên thuốc: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Tên thuốc không được để trống.");
            return;
        }

        double price;
        while (true) {
            System.out.print("Nhập đơn giá (VNĐ): ");
            String p = scanner.nextLine().trim();
            try {
                price = Double.parseDouble(p);
                if (price < 0) {
                    System.out.println("Đơn giá phải >= 0. Nhập lại.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Đơn giá không hợp lệ. Nhập lại.");
            }
        }

        int qty;
        while (true) {
            System.out.print("Nhập số lượng: ");
            String q = scanner.nextLine().trim();
            try {
                qty = Integer.parseInt(q);
                if (qty <= 0) {
                    System.out.println("Số lượng phải > 0. Nhập lại.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Số lượng không hợp lệ. Nhập lại.");
            }
        }

        Medicine existing = findById(id);
        if (existing != null) {
            existing.addQuantity(qty);
            System.out.println("Mã thuốc đã tồn tại. Đã cộng thêm số lượng. Bản ghi hiện tại:");
            System.out.printf("  %s | %s | %.0f VNĐ | %d\n",
                    existing.getDrugId(), existing.getDrugName(), existing.getUnitPrice(), existing.getQuantity());
        } else {
            Medicine m = new Medicine(id, name, price, qty);
            order.add(m);
            System.out.println("Đã thêm thuốc vào đơn: " + id + " - " + name);
        }
    }

    private static void adjustQuantity() {
        System.out.print("Nhập mã thuốc cần điều chỉnh: ");
        String id = scanner.nextLine().trim();
        Medicine m = findById(id);
        if (m == null) {
            System.out.println("Không tìm thấy thuốc với mã: " + id);
            return;
        }
        int newQty;
        while (true) {
            System.out.print("Nhập số lượng mới (0 để xóa): ");
            String s = scanner.nextLine().trim();
            try {
                newQty = Integer.parseInt(s);
                if (newQty < 0) {
                    System.out.println("Số lượng không được âm. Nhập lại.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Số lượng không hợp lệ. Nhập lại.");
            }
        }
        if (newQty == 0) {
            order.remove(m);
            System.out.println("Đã xóa thuốc khỏi đơn (số lượng = 0): " + id);
        } else {
            m.setQuantity(newQty);
            System.out.println("Cập nhật số lượng thành công: " + id + " -> " + newQty);
        }
    }

    private static void removeMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = scanner.nextLine().trim();
        Medicine m = findById(id);
        if (m == null) {
            System.out.println("Không tìm thấy thuốc với mã: " + id);
            return;
        }
        order.remove(m);
        System.out.println("Đã xóa thuốc: " + id + " - " + m.getDrugName());
    }

    private static void printInvoice() {
        if (order.isEmpty()) {
            System.out.println("Đơn đang trống. Không có gì để in.");
            return;
        }
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("===== HÓA ĐƠN THUỐC =====");
        System.out.printf("%-10s %-25s %12s %10s %15s\n",
                "Mã", "Tên thuốc", "Đơn giá (VNĐ)", "Số lượng", "Thành tiền (VNĐ)");
        System.out.println("--------------------------------------------------------------------------------");
        double total = 0.0;
        for (Medicine m : order) {
            double line = m.lineTotal();
            total += line;
            System.out.printf("%-10s %-25s %12s %10d %15s\n",
                    m.getDrugId(),
                    truncate(m.getDrugName(), 25),
                    df.format(m.getUnitPrice()),
                    m.getQuantity(),
                    df.format(line));
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-54s %15s\n", "TỔNG TIỀN (VNĐ):", df.format(total));
        // Sau khi in hóa đơn, xóa hết các phần tử thuốc trong danh sách
        order.clear();
        System.out.println("Đã xóa toàn bộ thuốc trong đơn sau khi in hóa đơn.");
    }

    private static void findCheapMedicines() {
        boolean found = false;
        System.out.println("Thuốc có đơn giá < 50.000 VNĐ:");
        for (Medicine m : order) {
            if (m.getUnitPrice() < 50000.0) {
                if (!found) {
                    System.out.printf("%-10s %-25s %12s %10s\n", "Mã", "Tên thuốc", "Đơn giá", "Số lượng");
                    System.out.println("---------------------------------------------------------------");
                }
                found = true;
                System.out.printf("%-10s %-25s %12.0f %10d\n",
                        m.getDrugId(), truncate(m.getDrugName(), 25), m.getUnitPrice(), m.getQuantity());
            }
        }
        if (!found) {
            System.out.println("Không có thuốc nào thỏa điều kiện.");
        }
    }

    private static Medicine findById(String id) {
        for (Medicine m : order) {
            if (m.getDrugId().equalsIgnoreCase(id)) {
                return m;
            }
        }
        return null;
    }

    private static String truncate(String s, int maxLen) {
        if (s == null) return "";
        return s.length() <= maxLen ? s : s.substring(0, maxLen - 3) + "...";
    }
}

