package shop.Service;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {


    //Объект таблицы
    DefaultTableModel defaultTableModel=new DefaultTableModel();
    JTable jTabPeople=new JTable(defaultTableModel);

    {
        defaultTableModel.addColumn("Name");
        defaultTableModel.addColumn("Price");



    }

    public Window() {  //Создаем новый контейнер JFrame
        //Устанавливаем диспетчер компоновки
        // getContentPane().setLayout(new FlowLayout());
        Panel p=new Panel();
        JTextField text1= new JTextField();
        JTextField text2= new JTextField();
        JTextField text3= new JTextField();
        p.add(text1);
        text1.setColumns(10);
        text2.setColumns(10);
        p.add(text2);
//        p.add(text3);
//        text3.setColumns(10);
        JButton remove_student = new JButton("remove student");
        JButton add_student = new JButton("add student");

        remove_student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = jTabPeople.getSelectedRow();
                System.out.println(defaultTableModel.getValueAt(0,1));
                defaultTableModel.removeRow(selectedRow);
            }
        });
        add_student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String name = text1.getText();
            String count = text2.getText();
            defaultTableModel.addRow(new Object[]{name,count});
            }
        });
        //Устанавливаем размер окна
        setSize(400, 500);
        //Устанавливаем завершение программы при закрытии окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Создаем новую таблицу на основе двумерного массива данных и заголовков
//        jTabPeople = new JTable(data, headers);
        //Создаем панель прокрутки и включаем в ее состав нашу таблицу
        JScrollPane jscrlp = new JScrollPane(jTabPeople);
        //Устаналиваем размеры прокручиваемой области
        jTabPeople.setPreferredScrollableViewportSize(new Dimension(250, 100));
        //Добавляем в контейнер нашу панель прокрути и таблицу вместе с ней
        p.setLayout(new FlowLayout());

        p.add(jscrlp);
        setContentPane(p);
        getContentPane().add(jscrlp);
        p.add(remove_student);
        p.add(add_student);
        setLocationRelativeTo(null);

        //Отображаем контейнер
        setVisible(true);
    }


}



