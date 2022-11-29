/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.CadastroCliente;
import model.Empresa;

public class CadastroDAO {

    private final Connection connection;

    public CadastroDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(CadastroCliente cadastroCliente) throws SQLException {

        String sql = "insert into cadastroCliente(nome, cpf, sexo, email, telefone, cidade, estado) values('" + cadastroCliente.getNome() + "', '" + cadastroCliente.getCpf() + "', '" + cadastroCliente.getSexo() + "', '" + cadastroCliente.getEmail() + "', '" + cadastroCliente.getTelefone() + "', '" + cadastroCliente.getCidade() + "', '" + cadastroCliente.getEstado() + "');";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.execute();
    }

    public void insert(Empresa empresa) throws SQLException {
        String sql = "insert into empresa(razaoSocial, cnpj, endereco) values('" + empresa.getRazaoSocial() + "', '" + empresa.getCnpj() + "', '" + empresa.getEndereco() + "');";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.execute();
    }

}
