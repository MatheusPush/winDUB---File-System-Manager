package algumacoisa;

import java.awt.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

public class frmPrincipal extends javax.swing.JFrame {

    public static String nomePiva = "";
    public static List<Arquivo> arquivos;
    public static List<Pasta> pastas;

    public frmPrincipal() {
        //initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("WINPIVA 1.0");
    }

    /*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCriarArquivo = new javax.swing.JButton();
        btnSeleionarArquivo = new javax.swing.JButton();
        btnExcluitArquivo = new javax.swing.JButton();
        btnCopiarArquivo = new javax.swing.JButton();
        lblCaminhoArquivo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblArquivo = new javax.swing.JLabel();
        btnVisualizarArquivo = new javax.swing.JButton();
        btnCriarPasta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmPrincipal"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 24, -1, -1));

        btnCriarArquivo.setText("Criar Arquivo .piva");
        btnCriarArquivo.setToolTipText("");
        btnCriarArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCriarArquivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCriarArquivo.setIconTextGap(15);
        btnCriarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarArquivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCriarArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 200, 40));

        btnSeleionarArquivo.setText("Importar Arquivo .piva");
        btnSeleionarArquivo.setToolTipText("Importar arquivo existente");
        btnSeleionarArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSeleionarArquivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSeleionarArquivo.setIconTextGap(15);
        btnSeleionarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleionarArquivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleionarArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 200, 40));

        btnExcluitArquivo.setText("Excluir");
        btnExcluitArquivo.setToolTipText("Remover arquivo ou pasta");
        btnExcluitArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExcluitArquivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExcluitArquivo.setIconTextGap(15);
        btnExcluitArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluitArquivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluitArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 195, 40));

        btnCopiarArquivo.setText("Copiar Arquivo");
        btnCopiarArquivo.setToolTipText("Copiar arquivo para o computador");
        btnCopiarArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCopiarArquivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCopiarArquivo.setIconTextGap(15);
        btnCopiarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarArquivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCopiarArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 195, 40));

        lblCaminhoArquivo.setText("Caminho: ");
        getContentPane().add(lblCaminhoArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 3, 18)); // NOI18N
        jLabel2.setText("WinPiva 1.0");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 30));

        lblArquivo.setText("Dados do arquivo selecionado");
        getContentPane().add(lblArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        btnVisualizarArquivo.setText("Visualizar Texto (.txt)");
        btnVisualizarArquivo.setToolTipText("Abrir conteúdo de arquivo .txt");
        btnVisualizarArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVisualizarArquivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVisualizarArquivo.setIconTextGap(15);
        btnVisualizarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarArquivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnVisualizarArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 195, 40));

        btnCriarPasta.setText("Criar Pasta");
        btnCriarPasta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCriarPasta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCriarPasta.setIconTextGap(15);
        btnCriarPasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarPastaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCriarPasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 195, 40));

        jTree1.setModel(null);
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 450, 240));

        jButton2.setText("Inserir Arquivo");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setIconTextGap(15);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 195, 40));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 10, 360));

        jButton3.setText("Mover de Pasta");
        jButton3.setToolTipText("Alterar a pasta do arquivo");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setIconTextGap(15);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 195, 40));

        jButton1.setText("Mover Arquivo");
        jButton1.setToolTipText("Mover o arquivo selecionado para o computador");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setIconTextGap(15);
        jButton1.setName(""); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 195, 40));
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel3.setText("Clique duas vezes sobre um arquivo para visualizar suas informações.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 354, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    */
    
    private void btnCriarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarArquivoActionPerformed

        // Criando o arquivo .piva
        JFrame parentFrame = new JFrame();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecione o local");
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Arquivos Binários (.piva)", "piva"));
        fileChooser.setAcceptAllFileFilterUsed(false);

        int userSelection = fileChooser.showSaveDialog(parentFrame);

        if (userSelection == JFileChooser.APPROVE_OPTION) { // Usuário confirmou ação

            String caminho;
            String nome = "Root.piva";

            File fileToSave = fileChooser.getSelectedFile();
            caminho = fileToSave.getAbsolutePath();

            nome = fileToSave.getName();

            DataOutputStream dos = null;
            try {
                dos = new DataOutputStream(new FileOutputStream(caminho + ".piva"));
                //            byte teste = (byte) 0xAA; // 10101010 em binário 
                //            dos.writeByte(teste);
                dos.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Finalizada a criarção do arquivo .piva, falta inserir o TXT com os dados dentro do arquivo
            try {
                FileWriter arq = new FileWriter(caminho + ".txt");
                PrintWriter gravarDados = new PrintWriter(arq);
                gravarDados.println("0");

                // Gravar código sha1
                gravarDados.println(getCodigoVerificador(caminho));

                arq.close();
            } catch (IOException e) {
                System.out.println("Erro: " + e);
            } catch (Exception e) {
                System.out.println("Erro: " + e);
            }

            lblCaminhoArquivo.setText(caminho + ".piva"); // Guardar o caminho do arquivo .piva

            // Criar a "primeira pasta", que é a Raiz
            addPastaHeader("Raiz", caminho);

            nomePiva = nome; // Guardar nome do arquivo .pivas

            montarArquivos(caminho, nome); // Montar a estrutura do .piva

            JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso!");
        }
    }//GEN-LAST:event_btnCriarArquivoActionPerformed

    private void btnSeleionarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleionarArquivoActionPerformed

        JFileChooser filec = new JFileChooser();
        filec.addChoosableFileFilter(new FileNameExtensionFilter("Arquivos Binários", "piva"));
        filec.setAcceptAllFileFilterUsed(false);

        Component myjframe = null;
        int fileval = filec.showOpenDialog(myjframe);

        if (fileval == JFileChooser.APPROVE_OPTION) { // Usuário confirmou ação

            if (verificarCodidoVerificador(filec.getSelectedFile().getAbsolutePath().replace(".piva", ""))) {

                lblCaminhoArquivo.setText(filec.getSelectedFile().getAbsolutePath());

                nomePiva = filec.getSelectedFile().getName();

                montarArquivos(lblCaminhoArquivo.getText().replace(".piva", ""), nomePiva);

            } else {
                JOptionPane.showMessageDialog(null, "Erro: Não é possível importar o arquivo selecionado "
                        + "pois ele teve seu código alterado.");
            }
        }
    }//GEN-LAST:event_btnSeleionarArquivoActionPerformed

    private void btnCopiarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarArquivoActionPerformed

        if (pastas != null) { // Verificar se existe uma pasta, ou seja, um .piva aberto

            DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();

            if (node != null) { // Verificar se algum arquivo foi selecionado

                String arquivoSelecionado = node.getUserObject().toString(); // Nome do arquivo selecionado 

                if (!(arquivoSelecionado.equals(nomePiva)
                        || arquivoSelecionado.equals(nomePiva + ".piva"))) {

                    // Se o nome selecionado conter "." significa que é um arquivo (não uma pasta)
                    if (arquivoSelecionado.contains(".")) {

                        String pasta = node.getParent().toString(); // Pasta do arquivo

                        // Se a pasta tiver o nome do .piva, significa que é a raiz                    
                        if (pasta.equals(nomePiva)) {
                            pasta = "Raiz";
                        }

                        // Selecionar o diretório que irá salvar a cópia
                        JFileChooser filec = new JFileChooser();
                        filec.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

                        Component myjframe = null;
                        int fileval = filec.showOpenDialog(myjframe);

                        if (fileval == JFileChooser.APPROVE_OPTION) { // Usuário confirmou ação

                            JanelaCarregando carregando = new JanelaCarregando();

                            carregando.start();

                            String caminho = filec.getSelectedFile().getAbsolutePath();

                            copiarArquivoParaDiretorio(caminho, arquivoSelecionado, pasta);

                            Winpiva.controle = 1;

                            JOptionPane.showMessageDialog(this, "Movimentação Concluída!\nAcesse " + caminho);
                        }

                    } else {
                        // Aviso que foi selecionado uma pasta e só arquivos são aceitos nessa função
                        JOptionPane.showMessageDialog(null, "Não é possível copiar uma pasta. Selecione um arquivo.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível copiar um arquivo .piva.");
                }
            } else {
                // Não selecionou arquivo
                JOptionPane.showMessageDialog(null, "É necessário selecionar um arquivo.");
            }

        } else {
            // Aviso que é necessário ter um .piva aberto
            JOptionPane.showMessageDialog(null, "Importe ou crie um arquivo .piva!");
        }

        Winpiva.controle = 0;
    }//GEN-LAST:event_btnCopiarArquivoActionPerformed

    private void btnVisualizarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarArquivoActionPerformed

        if (pastas != null) { // Verificar se existe um .piva aberto

            DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();

            if (node != null) { // Verificar se algum arquivo foi selecionado

                String arquivoSelecionado = node.getUserObject().toString();

                if (arquivoSelecionado.toLowerCase().endsWith(".txt")) { // Verificar se é um arquivo txt

                    String pasta = node.getParent().toString();

                    // Se a pasta tiver o nome do .piva, significa que é a raiz
                    if (pasta.equals(nomePiva)) {
                        pasta = "Raiz";
                    }

                    Arquivo arquivoTxt = new Arquivo();

                    // Buscar arquivo
                    for (Pasta p : pastas) {

                        if (p.getNome().equals(pasta)) {

                            for (Arquivo a : p.getArquivos()) {

                                if (a.getNome().equals(arquivoSelecionado)) {
                                    arquivoTxt = a; // Guardar na variável
                                    break;
                                }
                            }
                        }
                    }

                    try {
                        Path path = Paths.get(lblCaminhoArquivo.getText());
                        byte[] data = Files.readAllBytes(path);

                        // Pegar parte dos bytes do arquivo
                        byte[] bytes = Arrays.copyOfRange(data, arquivoTxt.getInicio(), arquivoTxt.getFim() + 1);

                        // Converter para string
                        String texto = new String(bytes, StandardCharsets.ISO_8859_1);

                        // Abrir janela com a mensagem
                        JOptionPane.showMessageDialog(null, texto);

                    } catch (FileNotFoundException e) {
                        System.out.println("Erro: " + e);
                    } catch (IOException e) {
                        System.out.println("Erro: " + e);
                    }

                } else {
                    // Exibir mensagem que o arquivo selecionado não é válido para essa função
                    JOptionPane.showMessageDialog(null, "Erro: O arquivo selecionado não é .txt");
                }

            } else {
                // Não selecionou arquivo
                JOptionPane.showMessageDialog(null, "É necessário selecionar um arquivo.");
            }

        } else {
            // Exibir mensagem que é necessário abrir um .piva
            JOptionPane.showMessageDialog(null, "Importe ou crie um arquivo .piva!");
        }

    }//GEN-LAST:event_btnVisualizarArquivoActionPerformed

    private void btnCriarPastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarPastaActionPerformed

        if (pastas != null) {

            String pasta = JOptionPane.showInputDialog("Digite o nome da nova pasta:");

            if (pasta.contains(".")) {

                // Trocar "." por "_" pois apenas arquivos podem possuir esse caracter
                pasta = pasta.replaceAll("\\.", "_");
                JOptionPane.showMessageDialog(null, "OBS.: Por convensão, apenas arquivos possuem '.' e, por isso, "
                        + " eles foram substituidos por '_'.");
            }

            if (pasta.equals("Raiz")) {
                // Raiz é uma palavra reservada
                pasta = "Raiz2";
                JOptionPane.showMessageDialog(null, "OBS.: O nome selecionado é uma palavra reservada e, por isso,"
                        + " foi substituida por Raiz2.");
            }

            if (!existePasta(pasta)) { // Verificar se já existe uma pasta com o nome selecionado

                // Adicionar pasta no header
                addPastaHeader(pasta, lblCaminhoArquivo.getText().replace(".piva", ""));

                // Remontar painel com os arquivos
                montarArquivos(lblCaminhoArquivo.getText().replace(".piva", ""), nomePiva);

                JOptionPane.showMessageDialog(null, "Pasta criada com sucesso!");
            } else {
                // Exibir mensagem que já existe uma pasta com esse nome
                JOptionPane.showMessageDialog(null, "Erro: Já existe uma pasta com esse nome.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Importe ou crie um arquivo .piva!");
        }
    }//GEN-LAST:event_btnCriarPastaActionPerformed

    private void btnExcluitArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluitArquivoActionPerformed

        if (pastas != null) { // Verificar se existe .piva aberto

            DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();

            if (node != null) { // Verificar se algum arquivo foi selecionado

                String arquivoSelecionado = node.getUserObject().toString();

                if (!(arquivoSelecionado.equals(nomePiva)
                        || arquivoSelecionado.equals(nomePiva + ".piva"))) {

                    int qtdeArquivosRemovidos = 0;

                    if (arquivoSelecionado.contains(".")) { // Se tiver ".", é um arquivo

                        String pastaSelecionada = node.getParent().toString();

                        // Se a pasta tiver o nome do .piva, significa que é a raiz
                        if (pastaSelecionada.contains(nomePiva)) {
                            pastaSelecionada = "Raiz";
                        }

                        qtdeArquivosRemovidos = removerArquivo(arquivoSelecionado, pastaSelecionada);

                    } else { // Pasta

                        qtdeArquivosRemovidos = removerPasta(arquivoSelecionado);
                    }

                    // Atualizar quantidade de arquivos, removendo do total o número de arquivos removidos
                    atualizarQtdeArquivos(lblCaminhoArquivo.getText().replace(".piva", ".txt"), -qtdeArquivosRemovidos);

                    montarArquivos(lblCaminhoArquivo.getText(), nomePiva);

                    JOptionPane.showMessageDialog(this, "Remoção concuída!");
                } else {
                    // Arquivo .piva
                    JOptionPane.showMessageDialog(null, "Não é possível remover um arquivo .piva.");
                }
            } else {

                // Não selecionou arquivo
                JOptionPane.showMessageDialog(null, "É necessário selecionar um arquivo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Importe ou crie um arquivo .piva!");
        }
    }//GEN-LAST:event_btnExcluitArquivoActionPerformed

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked

        // Quando clicar duas vezes na pasta/arquivo, mostrar suas informações
        if (evt.getClickCount() == 2) {

            DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();

            String informacoes = "Erro";

            if (node != null) {

                String nomeArquivo = node.getUserObject().toString();

                String nomePasta = "";

                if (node.getParent() != null) {

                    nomePasta = node.getParent().toString();
                } else {
                    // Node parent é null quando clica na pasta da raiz
                    nomeArquivo = "Raiz";
                }

                if (nomeArquivo.contains(".")) { // Arquivo

                    if (nomePasta.equals(nomePiva)) {
                        nomePasta = "Raiz";
                    }

                    // Buscar arquivo selecionado
                    for (Pasta p : pastas) {
                        if (p.getNome().equals(nomePasta)) {

                            for (Arquivo a : p.getArquivos()) {

                                if (a.getNome().equals(nomeArquivo)) {
                                    informacoes = "Nome: " + a.getNome() + "\n"
                                            + "Data de adição: " + a.getData() + "\n"
                                            + "Pasta: " + a.getPasta();
                                }
                            }
                        }
                    }

                } else { // Pasta

                    for (Pasta p : pastas) { // Buscar pasta selecionada

                        if (p.getNome().equals(nomeArquivo)) {
                            informacoes = "Nome da Pasta: " + p.getNome() + "\n"
                                    + "Data de criação: " + p.getData();
                        }
                    }
                }

                JOptionPane.showMessageDialog(this, informacoes); // Exibir informações
            }
        }
    }//GEN-LAST:event_jTree1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (pastas != null) { // Verificar se existe .piva aberto

            if (verificarCodidoVerificador(lblCaminhoArquivo.getText().replace(".piva", ""))) {

                String pastaSelecionada = "Raiz";
                boolean cancelado = false;

                /* Verifica se existe mais de uma pasta.
                 * Se existir, abre popup para selecionar a pasta que o arquivo será inserido.
                 * Se não existir pasta, salva na raiz.
                 */
                if (pastas.size() > 1) {

                    List<String> opcoesPasta = new ArrayList<String>();

                    for (Pasta p : pastas) {
                        opcoesPasta.add(p.getNome());
                    }

                    Object selected = JOptionPane.showInputDialog(null, "Selecionar Pasta", "Selection",
                            JOptionPane.DEFAULT_OPTION, null, opcoesPasta.toArray(), "0");

                    if (selected != null) { // NULL quando usuário cancela

                        pastaSelecionada = selected.toString();

                    } else {
                        cancelado = true; // Ação cancelada
                    }
                }

                if (!cancelado) { // Se a ação não foi cancelada
                    JFileChooser filec = new JFileChooser();
                    Component myjframe = null;
                    int fileval = filec.showOpenDialog(myjframe);

                    if (fileval == JFileChooser.APPROVE_OPTION) { // Ação confirmada

                        JanelaCarregando carregando = new JanelaCarregando();

                        carregando.start();

                        // Inserir arquivo binário no .piva e informações no header
                        if (inserirArquivoBin(filec.getSelectedFile().getAbsolutePath(), lblCaminhoArquivo.getText(),
                                filec.getSelectedFile().getName(), pastaSelecionada)) {

                            Winpiva.controle = 1;

                            // Inserção com sucesso
                            montarArquivos(lblCaminhoArquivo.getText(), nomePiva);

                            atualizarCodigoVerificador(lblCaminhoArquivo.getText().replace(".piva", ""));

                            JOptionPane.showMessageDialog(null, "Arquivo inserido com sucesso!");

                        } else {
                            // Exibir mensagem de erro
                            JOptionPane.showMessageDialog(null, "Erro: Arquivo inválido!");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro: O arquivo " + nomePiva + ".piva foi modificado.");
                jButton2.setEnabled(false);
                btnCriarPasta.setEnabled(false);
                btnVisualizarArquivo.setEnabled(false);
                btnExcluitArquivo.setEnabled(false);
                btnCopiarArquivo.setEnabled(false);
                jButton1.setEnabled(false);
                jButton3.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Importe ou crie um arquivo .piva!");
        }

        Winpiva.controle = 0;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (pastas != null) {

            DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();

            if (node != null) { // Verificar se algum arquivo foi selecionado

                String arquivoSelecionado = node.getUserObject().toString();

                if (!(arquivoSelecionado.equals(nomePiva)
                        || arquivoSelecionado.equals(nomePiva + ".piva"))) {

                    if (arquivoSelecionado.contains(".")) { // Arquivo

                        String pasta = node.getParent().toString();

                        if (pasta.equals(nomePiva)) {
                            pasta = "Raiz";
                        }

                        // Selecionar diretório que vai mover
                        JFileChooser filec = new JFileChooser();
                        filec.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

                        Component myjframe = null;

                        int fileval = filec.showOpenDialog(myjframe);

                        if (fileval == JFileChooser.APPROVE_OPTION) { // Ação confirmada

                            JanelaCarregando carregando = new JanelaCarregando();

                            carregando.start();

                            String caminho = filec.getSelectedFile().getAbsolutePath();

                            copiarArquivoParaDiretorio(caminho, arquivoSelecionado, pasta); // Copiar p/ diretório

                            Winpiva.controle = 1;

                            int qtdeArquivosRemovidos = removerArquivo(arquivoSelecionado, pasta); // Remover do header

                            // Atualizar qtde de arquivos
                            atualizarQtdeArquivos(lblCaminhoArquivo.getText().replace(".piva", ".txt"), -qtdeArquivosRemovidos);

                            // Remontar exibição de arquivos
                            montarArquivos(lblCaminhoArquivo.getText(), nomePiva);

                            JOptionPane.showMessageDialog(this, "Movimentação Concluída!\nAcesse " + caminho);
                        }

                    } else {
                        // Exibir mensagem de erro, usuário selecionou uma pasta.
                        JOptionPane.showMessageDialog(null, "Não é possível fazer a movimentação de uma pasta. Selecione um arquivo.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível mover um arquivo .piva.");
                }
            } else {
                // Não selecionou arquivo
                JOptionPane.showMessageDialog(null, "É necessário selecionar um arquivo.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Importe ou crie um arquivo .piva!");
        }

        Winpiva.controle = 0;

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (pastas != null) {

            if (pastas.size() > 1) { // Verificar se existe alguma pasta para mover o arquivo

                DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();

                if (node != null) { // Verificar se algum arquivo foi selecionado

                    String arquivoSelecionado = node.getUserObject().toString();

                    if (arquivoSelecionado.contains(".")) { // É arquivo

                        String pastaAntiga = node.getParent().toString();

                        if (pastaAntiga.equals(nomePiva)) {
                            pastaAntiga = "Raiz";
                        }

                        List<String> opcoesPasta = new ArrayList<String>();

                        // Salvar pastas diferentes da pasta atual
                        for (Pasta p : pastas) {
                            if (!p.getNome().equals(pastaAntiga)) {
                                opcoesPasta.add(p.getNome());
                            }
                        }

                        Object selected = JOptionPane.showInputDialog(null, "Selecionar Nova Pasta:", "Selection",
                                JOptionPane.DEFAULT_OPTION, null, opcoesPasta.toArray(), "0");

                        if (selected != null) { // NULL quando usuário cancela

                            alterarPasta(arquivoSelecionado, pastaAntiga, selected.toString()); // Alterar
                            montarArquivos(lblCaminhoArquivo.getText().replace(".piva", ""), nomePiva);

                        }

                    } else {
                        // Selecionou uma pasta
                        JOptionPane.showMessageDialog(null, "Erro: O arquivo selecionado é uma pasta.");
                    }
                } else {
                    // Não selecionou arquivo
                    JOptionPane.showMessageDialog(null, "É necessário selecionar um arquivo.");
                }
            } else {
                // Não existe pasta 
                JOptionPane.showMessageDialog(null, "É necessário criar pelo menos uma pasta.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Importe ou crie um arquivo .piva!");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiarArquivo;
    private javax.swing.JButton btnCriarArquivo;
    private javax.swing.JButton btnCriarPasta;
    private javax.swing.JButton btnExcluitArquivo;
    private javax.swing.JButton btnSeleionarArquivo;
    private javax.swing.JButton btnVisualizarArquivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblArquivo;
    private javax.swing.JLabel lblCaminhoArquivo;
    // End of variables declaration//GEN-END:variables

    //----------------------------FUNÇÕES---------------------------------------------    
    public static boolean inserirArquivoBin(String txt, String piva, String nomeArquivo, String pastaSelecionada) {

        int x;

        try {
            //Lendo arquivo .piva e jogando dentro de um Array
            File arquivoDestino = new File(piva);
            FileOutputStream o = new FileOutputStream(arquivoDestino, true);
            BufferedOutputStream out = new BufferedOutputStream(o);
            
            //Lendo arquivo .txt e jogando dentro de um Array
            File arquivoTxt = new File(txt);
            //FileInputStream varLerTxt = new FileInputStream(arquivoTxt);
            BufferedInputStream inTxt = new BufferedInputStream(new FileInputStream(arquivoTxt));
            
            //byte[] array = Files.readAllBytes(arquivoTxt.toPath()); 
            
            //varLerTxt.read(array);

            long inicio = o.getChannel().position(); // Posição atual

            //buscar a qt de bit inseridas no arquivo pelo header
            while (inTxt.read() != -1) {
                out.write(inTxt.read());
                out.flush();
            }

            // Adicionar informações do arquivo no header
            addArquivoHeader(nomeArquivo, inicio, o.getChannel().position() - 1, piva, pastaSelecionada);

            inTxt.close();
            out.close();

        } catch (Exception e) {
            System.out.println("Erro = " + e);
            return false;
        }

        return true;
    }

    public static void lerArquivoBin(String origem, String destino) {

        try {
            File fileOrigin = new File(origem);
            File fileDestiny = new File(destino);

            FileInputStream i = new FileInputStream(fileOrigin);
            FileOutputStream o = new FileOutputStream(fileDestiny);

            BufferedInputStream in = new BufferedInputStream(i);
            BufferedOutputStream out = new BufferedOutputStream(o);

            int x;
            while ((x = in.read()) != -1) {
                out.write(x);
            }

            in.close();
            out.close();

        } catch (Exception e) {
            System.out.println("Erro = " + e);
        }
    }

    /**
     * Método que insere informações do arquivo no header.
     *
     * @param nome - Nome do arquivo
     * @param inicio - Posição de início no .piva
     * @param fim - Posição final no .piva
     * @param piva - Caminho do .piva
     * @param pasta - Nome da pasta
     * @return Se o arquivo foi adicionado com sucesso
     */
    public static boolean addArquivoHeader(String nome, long inicio, long fim, String piva, String pasta) {

        String txt = piva.replace(".piva", ".txt");

        try {
            BufferedWriter arq = new BufferedWriter(new FileWriter(txt, true));

            Calendar c = Calendar.getInstance();

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            arq.append(TIPO_ARQUIVO + " / " + nome + " / " + inicio + " / " + fim + " / "
                    + df.format(c.getTime()) + " / " + pasta);
            arq.newLine();

            arq.close();
        } catch (IOException e) {
            System.out.println("Erro na adição de informações no arquivo header.txt");
            return false;
        }

        atualizarQtdeArquivos(txt, 1);  // Somar 1 na quantidade de arquivos

        return true;
    }

    /**
     * Método que insere as informações de uma nova pasta no header.
     *
     * @param nome - Nome da pasta
     * @param caminho - Caminho do .piva
     * @return Se as informações da pasta foram inseridas com sucesso
     */
    public static boolean addPastaHeader(String nome, String caminho) {

        try {
            BufferedWriter arq = new BufferedWriter(new FileWriter(caminho + ".txt", true));

            Calendar c = Calendar.getInstance();

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            arq.append(TIPO_PASTA + " / " + nome + " / " + df.format(c.getTime()));

            arq.newLine();

            arq.close();
        } catch (IOException e) {
            System.out.println("Erro na adição de informações na pasta header.txt.");
            System.out.println("Erro: " + e);
            return false;
        }

        return true;
    }

    /**
     * Método que atualiza a quantidade de arquivos no header (1ª linha do .txt)
     *
     * @param header - Caminho do header
     * @param qtdeAdicionar - Quantidade para adicionar/remover
     */
    public static void atualizarQtdeArquivos(String header, int qtdeAdicionar) {

        try {
            RandomAccessFile f = new RandomAccessFile(header, "rw");
            f.seek(0); // ir para o ínicio

            int qtde = Integer.parseInt(f.readLine()) + qtdeAdicionar; // novo valor
            f.seek(0);

            f.write((qtde + "\r\n").getBytes()); // atualizar
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que altera a pasta do arquivo selecionado.
     *
     * @param nome - Nome do arquivo
     * @param pastaAntiga - Nome da pasta antiga
     * @param novaPasta - Nome da nova pasta
     */
    public void alterarPasta(String nome, String pastaAntiga, String novaPasta) {

        String caminho = lblCaminhoArquivo.getText();

        caminho = caminho.replace(".piva", ".txt");

        if (!caminho.contains(".txt")) {
            caminho = caminho.concat(".txt");
        }

        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            String novo = "";

            while (linha != null) { // Leitura do arquivo

                boolean pastaEncontrada = false;

                if (linha.startsWith(TIPO_ARQUIVO + " / ")) {

                    Arquivo a = new Arquivo(linha);

                    // Pasta selecionada
                    if ((a.getNome().equals(nome) && a.getPasta().equals(pastaAntiga))) {

                        // Salvar com a nova pasta
                        novo += TIPO_ARQUIVO + " / " + a.getNome() + " / " + a.getInicio() + " / "
                                + a.getFim() + " / " + a.getData() + " / " + novaPasta + "\r\n";

                        pastaEncontrada = true;
                    }
                }

                if (!pastaEncontrada) { // Linha normal, apenas salvar
                    novo += linha + "\r\n";
                }

                linha = lerArq.readLine();
            }

            lerArq.close();

            FileOutputStream fileOut = new FileOutputStream(caminho);
            fileOut.write(novo.getBytes());
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que monta a estrutura de exibição do arquivo .piva aberto.
     *
     * @param caminho - Caminho do arquivo
     * @param piva - Nome do arquivo
     */
    public void montarArquivos(String caminho, String piva) {

        caminho = caminho.replace(".piva", ".txt");

        if (!caminho.contains(".txt")) {
            caminho = caminho.concat(".txt");
        }

        arquivos = new ArrayList<Arquivo>(); // Lista de arquivos

        pastas = new ArrayList<Pasta>(); // Lista de pastas

        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            while (linha != null) { // Leitura do arquivo

                if (linha.startsWith(TIPO_ARQUIVO + " / ")) {
                    // Adicionar arquivo
                    arquivos.add(new Arquivo(linha));
                }

                if (linha.startsWith(TIPO_PASTA + " / ")) {
                    // Adicionar pasta
                    pastas.add(new Pasta(linha));
                }

                linha = lerArq.readLine();
            }

            // Criar árvore dos arquivos
            javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode(piva);

            for (Pasta p : pastas) {

                javax.swing.tree.DefaultMutableTreeNode treePasta = null;

                if (!p.getNome().equals("Raiz")) {
                    // Se não for da pasta "Raiz", criar uma pasta na árvore (treePasta)
                    treePasta = new javax.swing.tree.DefaultMutableTreeNode(p.getNome(), true);
                }

                // Armazenar os arquivos da pasta em uma lista para depois atribuir no setArquivos()
                List<Arquivo> arqPasta = new ArrayList<Arquivo>();
                for (Arquivo a : arquivos) {

                    if (a.getPasta().equals(p.getNome())) {

                        arqPasta.add(a);

                        if (!p.getNome().equals("Raiz")) {
                            // Se não for raiz, adicionar arquivo em na treePasta (pasta na árvore)
                            treePasta.add(new javax.swing.tree.DefaultMutableTreeNode(a.getNome(), false));
                        } else {
                            // Se for raiz, armazenar direto no treeNode (pois não está em nenhuma pasta)
                            treeNode1.add(new javax.swing.tree.DefaultMutableTreeNode(a.getNome(), false));
                        }
                    }
                }

                if (!p.getNome().equals("Raiz")) {
                    // Adicionar a pasta no treeNode (raiz)
                    treeNode1.add(treePasta);
                }

                p.setArquivos(arqPasta); // Guardar os arquivos no atributo da pasta

                jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1, true));
                jScrollPane1.setViewportView(jTree1);
            }

            lerArq.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que cria uma cópia do arquivo no diretório selecionado.
     *
     * @param caminho - Caminho para salvar o arquivo
     * @param arquivoSelecionado - Nome do arquivo selecionado
     * @param pasta - Pasta do arquivo
     */
    public void copiarArquivoParaDiretorio(String caminho, String arquivoSelecionado, String pasta) {

        Arquivo copiar = new Arquivo();

        // Buscar o arquivo selecionado
        for (Pasta p : pastas) {

            if (p.getNome().equals(pasta)) {

                for (Arquivo a : p.getArquivos()) {

                    if (a.getNome().equals(arquivoSelecionado)) {
                        copiar = a; // Guardar na variável
                        break;
                    }
                }
            }
        }

        // Criar arquivo no diretório
        try {
            Path path = Paths.get(lblCaminhoArquivo.getText());
            byte[] data = Files.readAllBytes(path);

            DataOutputStream dos = null;

            dos = new DataOutputStream(new FileOutputStream(caminho + "\\Copia_" + arquivoSelecionado));

            // Pegar os bytes da posição salva no header
            for (int i = copiar.getInicio(); i <= copiar.getFim(); i++) {

                dos.writeByte(data[i]); // escrever no arquivo
            }

            dos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e);
        } catch (IOException e) {
            System.out.println("Erro: " + e);
        }
    }

    /**
     * Método que verifica se já existe uma pasta com o nome selecionado.
     *
     * @param nome - Nome selecionado
     */
    public boolean existePasta(String nome) {

        for (Pasta p : pastas) {
            if (p.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que remove o arquivo selecionado.
     *
     * @param nome - Nome do arquivo
     * @param pasta - Pasta do arquivo
     * @return Quantidade de arquivos removidos.
     */
    public int removerArquivo(String nome, String pasta) {

        String caminho = lblCaminhoArquivo.getText();

        caminho = caminho.replace(".piva", ".txt");

        if (!caminho.contains(".txt")) {
            caminho = caminho.concat(".txt");
        }

        int qtdeArquivosRemovidos = 0;

        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            String novo = ""; // String que vai armazenar o novo header, sem o arquivo removido

            while (linha != null) { // Leitura do arquivo

                boolean remover = false;

                if (linha.startsWith(TIPO_ARQUIVO + " / ")) {

                    Arquivo a = new Arquivo(linha);

                    // Arquivo selecionado
                    if ((a.getNome().equals(nome) && a.getPasta().equals(pasta))) {

                        remover = true;
                        qtdeArquivosRemovidos++;
                    }
                }

                if (!remover) { // Linha normal, apenas salvar
                    novo += linha + "\r\n";
                }

                linha = lerArq.readLine();
            }

            lerArq.close();

            // Escrever arquivo com a nova string
            FileOutputStream fileOut = new FileOutputStream(caminho);
            fileOut.write(novo.getBytes());
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return qtdeArquivosRemovidos;
    }

    /**
     * Método que remove a pasta selecionada e todos os arquivos dentro dela.
     *
     * @param nome - Nome da pasta
     * @return Quantidade de arquivos removidos.
     */
    public int removerPasta(String nome) {

        String caminho = lblCaminhoArquivo.getText();

        caminho = caminho.replace(".piva", ".txt");

        if (!caminho.contains(".txt")) {
            caminho = caminho.concat(".txt");
        }

        int qtdeArquivosRemovidos = 0;

        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            String novo = ""; // String que vai armazenar o novo header, sem o arquivo removido

            while (linha != null) { // Leitura do arquivo

                boolean remover = false;

                // Pasta selecionada
                if (linha.contains(TIPO_PASTA + " / ")) {

                    Pasta p = new Pasta(linha);

                    if (p.getNome().equals(nome)) {
                        remover = true;
                    }
                }

                if (linha.startsWith(TIPO_ARQUIVO + " / ")) {

                    Arquivo a = new Arquivo(linha);

                    // Arquivo dentro da pasta selecionada
                    if (a.getPasta().equals(nome)) {
                        remover = true;
                        qtdeArquivosRemovidos++;
                    }
                }

                if (!remover) {
                    novo += linha + "\r\n";
                }

                linha = lerArq.readLine();
            }

            lerArq.close();

            // Escrever novo header, sem a pasta e arquivos removidos
            FileOutputStream fileOut = new FileOutputStream(caminho);
            fileOut.write(novo.getBytes());
            fileOut.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e);
        } catch (IOException e) {
            System.out.println("Erro: " + e);
        }

        return qtdeArquivosRemovidos;
    }

    public static String byteArrayToHexString(byte[] b) {
        String result = "";
        for (int i = 0; i < b.length; i++) {
            result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
        }
        return result;
    }

    /**
     * Método que verifica se o código sha-1 salvo no header está igual ao
     * gerado para o arquivo .piva atual.
     *
     * @param caminho
     */
    public boolean verificarCodidoVerificador(String caminho) {

        try {
            String novo = getCodigoVerificador(caminho);

            Path txt = Paths.get(caminho + ".txt");

            //List<String> linhas = Files.readAllLines(txt);
            Charset charset = Charset.forName("ISO-8859-1");

            List<String> linhas = Files.readAllLines(txt, charset);

            if (linhas.get(1).equals(novo)) {
                return true;
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e);
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }

        return false;
    }

    /**
     * Método que atualiza o código sha-1 no header.
     *
     * @param caminho
     */
    public void atualizarCodigoVerificador(String caminho) {

        try {
            String atual = getCodigoVerificador(caminho);

            FileReader arq = new FileReader(caminho + ".txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            String novo = "";
            int count = 0;

            while (linha != null) { // Leitura do arquivo

                if (count == 1) {
                    novo += atual + "\r\n";
                } else {
                    novo += linha + "\r\n";
                }

                count++;
                linha = lerArq.readLine();
            }

            lerArq.close();
            FileOutputStream fileOut = new FileOutputStream(caminho + ".txt");
            fileOut.write(novo.getBytes());
            fileOut.close();

        } catch (IOException e) {
            System.out.println("Erro: " + e);
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }

    /**
     * @param caminho - Caminho do arquivo
     * @return Código verificador sha-1
     */
    private String getCodigoVerificador(String caminho) throws Exception {

        MessageDigest md = MessageDigest.getInstance("SHA1");
        FileInputStream fis = new FileInputStream(caminho + ".piva");
        byte[] dataBytes = new byte[1024];

        int nread = 0;

        while ((nread = fis.read(dataBytes)) != -1) {
            md.update(dataBytes, 0, nread);
        }

        byte[] mdbytes = md.digest();

        //convert the byte to hex format
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < mdbytes.length; i++) {
            sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }

    public static final String TIPO_ARQUIVO = "A";
    public static final String TIPO_PASTA = "P";
}
