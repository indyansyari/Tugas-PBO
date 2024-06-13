package Menu;

import data.Lokasi;
import data.user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainClass extends JFrame {
    private JTextField idLokasiField, latitudeField, longitudeField, kecamatanField, namaJalanField, noKantorField, deskripsiField;
    private JTextField userNameField, idUserField, passwordField, namaLengkapField, jkField, alamatField, telpField, tglLahirField, jumlahAnakField, masaKerjaField;
    private JTextArea displayArea;
    private ArrayList<Lokasi> lokasiList = new ArrayList<>();
    private ArrayList<user> userList = new ArrayList<>();

    public MainClass() {
        setTitle("CRUD Form");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(0, 2));

        // Lokasi Form
        panel.add(new JLabel("ID Lokasi:"));
        idLokasiField = new JTextField();
        panel.add(idLokasiField);

        panel.add(new JLabel("Latitude:"));
        latitudeField = new JTextField();
        panel.add(latitudeField);

        panel.add(new JLabel("Longitude:"));
        longitudeField = new JTextField();
        panel.add(longitudeField);

        panel.add(new JLabel("Kecamatan:"));
        kecamatanField = new JTextField();
        panel.add(kecamatanField);

        panel.add(new JLabel("Nama Jalan:"));
        namaJalanField = new JTextField();
        panel.add(namaJalanField);

        panel.add(new JLabel("No Kantor:"));
        noKantorField = new JTextField();
        panel.add(noKantorField);

        panel.add(new JLabel("Deskripsi:"));
        deskripsiField = new JTextField();
        panel.add(deskripsiField);

        // User Form
        panel.add(new JLabel("Username:"));
        userNameField = new JTextField();
        panel.add(userNameField);

        panel.add(new JLabel("ID User:"));
        idUserField = new JTextField();
        panel.add(idUserField);

        panel.add(new JLabel("Password:"));
        passwordField = new JTextField();
        panel.add(passwordField);

        panel.add(new JLabel("Nama Lengkap:"));
        namaLengkapField = new JTextField();
        panel.add(namaLengkapField);

        panel.add(new JLabel("Jenis Kelamin:"));
        jkField = new JTextField();
        panel.add(jkField);

        panel.add(new JLabel("Alamat:"));
        alamatField = new JTextField();
        panel.add(alamatField);

        panel.add(new JLabel("Telepon:"));
        telpField = new JTextField();
        panel.add(telpField);

        panel.add(new JLabel("Tanggal Lahir:"));
        tglLahirField = new JTextField();
        panel.add(tglLahirField);

        panel.add(new JLabel("Jumlah Anak:"));
        jumlahAnakField = new JTextField();
        panel.add(jumlahAnakField);

        panel.add(new JLabel("Masa Kerja:"));
        masaKerjaField = new JTextField();
        panel.add(masaKerjaField);

        add(panel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");
        JButton viewButton = new JButton("View");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addData();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateData();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteData();
            }
        });

        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewData();
            }
        });

        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(viewButton);

        add(buttonPanel, BorderLayout.SOUTH);

        displayArea = new JTextArea();
        add(new JScrollPane(displayArea), BorderLayout.EAST);
    }

    private void addData() {
        Lokasi lokasi = new Lokasi(idLokasiField.getText(), "", latitudeField.getText(), longitudeField.getText(), kecamatanField.getText(), namaJalanField.getText(), noKantorField.getText(), deskripsiField.getText());
        lokasiList.add(lokasi);

        user user1 = new user();
        user1.inputUser_name(userNameField.getText());
        user1.inputId_user(idUserField.getText());
        user1.inputPassword(passwordField.getText());
        user1.inputNama_lengkap(namaLengkapField.getText());
        user1.inputjk(jkField.getText());
        user1.inputAlamat(alamatField.getText());
        user1.inputTelp(telpField.getText());
        user1.inputtgl_lahir(tglLahirField.getText());
        user1.inputJumlahAnak(Integer.parseInt(jumlahAnakField.getText()));
        user1.inputMasaKerja(Integer.parseInt(masaKerjaField.getText()));
        userList.add(user1);
    }

    private void updateData() {
        String idLokasiToUpdate = idLokasiField.getText();
        String idUserToUpdate = idUserField.getText();

        // Update Lokasi
        for (Lokasi lokasi : lokasiList) {
            if (lokasi.getid_lokasi().equals(idLokasiToUpdate)) {
                lokasiList.remove(lokasi);
                Lokasi updatedLokasi = new Lokasi(idLokasiField.getText(), "", latitudeField.getText(), longitudeField.getText(), kecamatanField.getText(), namaJalanField.getText(), noKantorField.getText(), deskripsiField.getText());
                lokasiList.add(updatedLokasi);
                break;
            }
        }

        // Update User
        for (user user1 : userList) {
            if (user1.id_user.equals(idUserToUpdate)) {
                userList.remove(user1);
                user updatedUser = new user();
                updatedUser.inputUser_name(userNameField.getText());
                updatedUser.inputId_user(idUserField.getText());
                updatedUser.inputPassword(passwordField.getText());
                updatedUser.inputNama_lengkap(namaLengkapField.getText());
                updatedUser.inputjk(jkField.getText());
                updatedUser.inputAlamat(alamatField.getText());
                updatedUser.inputTelp(telpField.getText());
                updatedUser.inputtgl_lahir(tglLahirField.getText());
                updatedUser.inputJumlahAnak(Integer.parseInt(jumlahAnakField.getText()));
                updatedUser.inputMasaKerja(Integer.parseInt(masaKerjaField.getText()));
                userList.add(updatedUser);
                break;
            }
        }
    }

    private void deleteData() {
        String idLokasiToDelete = idLokasiField.getText();
        String idUserToDelete = idUserField.getText();

        // Delete Lokasi based on id_lokasi
        lokasiList.removeIf(lokasi -> lokasi.getid_lokasi().equals(idLokasiToDelete));

        // Delete user based on id_user
        userList.removeIf(user -> user.id_user.equals(idUserToDelete));
    }

    private void viewData() {
        displayArea.setText("");
        String idLokasiToView = idLokasiField.getText();
        String idUserToView = idUserField.getText();

        for (Lokasi lokasi : lokasiList) {
            if (lokasi.getid_lokasi().equals(idLokasiToView) || idLokasiToView.isEmpty()) {
                displayArea.append("ID Lokasi: " + lokasi.getid_lokasi() + "\n");
                displayArea.append("Latitude: " + lokasi.getLatitude() + "\n");
                displayArea.append("Longitude: " + lokasi.getLongitude() + "\n");
                displayArea.append("Kecamatan: " + lokasi.getKecamatan() + "\n");
                displayArea.append("Nama Jalan: " + lokasi.getNama_jalan() + "\n");
                displayArea.append("No Kantor: " + lokasi.getNo_kantor() + "\n");
                displayArea.append("Deskripsi: " + lokasi.getDeskripsi() + "\n\n");
            }
        }

        for (user user1 : userList) {
            if (user1.id_user.equals(idUserToView) || idUserToView.isEmpty()) {
                displayArea.append("Username: " + user1.user_name + "\n");
                displayArea.append("ID User: " + user1.id_user + "\n");
                displayArea.append("Nama Lengkap: " + user1.nama_lengkap + "\n");
                displayArea.append("Jenis Kelamin: " + user1.jk + "\n");
                displayArea.append("Alamat: " + user1.alamat + "\n");
                displayArea.append("Telepon: " + user1.telp + "\n");
                displayArea.append("Tanggal Lahir: " + user1.tgl_lahir + "\n");
                displayArea.append("Jumlah Anak: " + user1.jumlahAnak + "\n");
                displayArea.append("Masa Kerja: " + user1.masaKerja + "\n\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainClass().setVisible(true);
            }
        });
    }
}
