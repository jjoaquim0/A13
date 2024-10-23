import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SistemaPessoa extends JFrame {

    public SistemaPessoa() {
        // Configurações da janela principal
        setTitle("Sistema de Pessoa");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Criar barra de menu
        JMenuBar menuBar = new JMenuBar();

        // Criar menus
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuVisualizacao = new JMenu("Visualização");
        JMenu menuSair = new JMenu("Sair");

        // Criar itens de menu para "Cadastro"
        JMenuItem itemUsuarios = new JMenuItem("Usuários");
        JMenuItem itemPessoas = new JMenuItem("Pessoas");
        menuCadastro.add(itemUsuarios);
        menuCadastro.add(itemPessoas);

        // Criar itens de menu para "Visualização"
        JMenuItem itemListaUsuarios = new JMenuItem("Lista de usuário");
        JMenuItem itemListaPessoas = new JMenuItem("Lista de Pessoas");
        menuVisualizacao.add(itemListaUsuarios);
        menuVisualizacao.add(itemListaPessoas);

        // Adicionar ação ao menu "Sair"
        menuSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Adicionar menus à barra de menu
        menuBar.add(menuCadastro);
        menuBar.add(menuVisualizacao);
        menuBar.add(menuSair);

        // Definir a barra de menu na janela
        setJMenuBar(menuBar);

        // Criar o rodapé
        JPanel rodape = criarRodape();
        add(rodape, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Método para criar o rodapé
private JPanel criarRodape() {
    JPanel rodape = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Centraliza os componentes

    // Obter a data e hora atuais
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    String dataAcesso = sdf.format(new Date());

    // Label para a versão
    JLabel versaoLabel = new JLabel("Versão: 12.1.2024");
    
    // Label para o usuário
    JLabel usuarioLabel = new JLabel("Usuário: joaquim.filho");

    // Label para a data de acesso
    JLabel dataAcessoLabel = new JLabel("Data de acesso: " + dataAcesso);

    // Adicionar os componentes ao rodapé
    rodape.add(versaoLabel);
    rodape.add(usuarioLabel);
    rodape.add(dataAcessoLabel);

    return rodape;
}

    public static void main(String[] args) {
        new SistemaPessoa();
    }
}
