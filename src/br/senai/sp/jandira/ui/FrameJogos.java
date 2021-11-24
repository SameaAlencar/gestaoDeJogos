package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.FabricanteRepository;
import br.senai.sp.jandira.repository.JogoRepository;

import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JScrollBar;

public class FrameJogos extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtValor;
	private JTextField txtObservacoes;
	
	private Fabricante[] fabricante = null;
	private FabricanteRepository fabricanteRepository = null;

	private int posicao = 0;

	public FrameJogos() {
			
		setTitle("Meus jogos");
		setBackground(Color.PINK);
		setForeground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 408);
		contentPane = new JPanel();
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("T\u00EDtulo do jogo:");
		lblTitulo.setBounds(27, 22, 99, 14);
		contentPane.add(lblTitulo);

		txtTitulo = new JTextField();
		txtTitulo.setBounds(111, 19, 86, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);

		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setBounds(27, 59, 70, 14);
		contentPane.add(lblFabricante);

		JComboBox comboaFabricante = new JComboBox();
		DefaultComboBoxModel<String> comboModelFabricante = new DefaultComboBoxModel<String>();
		

		comboaFabricante.setBounds(98, 55, 99, 22);
		contentPane.add(comboaFabricante);

		JComboBox comboConsole = new JComboBox();
		DefaultComboBoxModel<String> comboModelConsole = new DefaultComboBoxModel<String>();

		for (Console descricao : Console.values()) {
			comboModelConsole.addElement(descricao.getDescricao());
		}

		comboConsole.setModel(comboModelConsole);
		comboConsole.setBounds(98, 93, 99, 22);
		contentPane.add(comboConsole);

		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setBounds(27, 97, 70, 14);
		contentPane.add(lblConsole);

		JLabel lblValor = new JLabel("Valor estimado:");
		lblValor.setBounds(10, 183, 99, 14);
		contentPane.add(lblValor);

		txtValor = new JTextField();
		txtValor.setBounds(111, 180, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);

		JLabel lblObservacoes = new JLabel("Oberva\u00E7\u00F5es:");
		lblObservacoes.setBounds(10, 208, 99, 14);
		contentPane.add(lblObservacoes);

		txtObservacoes = new JTextField();
		txtObservacoes.setBounds(111, 208, 86, 65);
		contentPane.add(txtObservacoes);
		txtObservacoes.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(47, 300, 114, 45);
		contentPane.add(btnSalvar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(277, 59, 155, 247);
		contentPane.add(scrollPane);

		JLabel lblMeusJogos = new JLabel("Meus jogos: ");
		lblMeusJogos.setBounds(277, 39, 86, 14);
		contentPane.add(lblMeusJogos);

		JButton btnEsquerda = new JButton("<");
		btnEsquerda.setBounds(336, 322, 42, 23);
		contentPane.add(btnEsquerda);

		JButton btnDireita = new JButton(">");
		btnDireita.setBounds(390, 322, 42, 23);
		contentPane.add(btnDireita);

		JCheckBox checkZerado = new JCheckBox("Zerado");
		checkZerado.setBounds(27, 132, 97, 23);
		contentPane.add(checkZerado);

		JList listJogos = new JList();
		scrollPane.setViewportView(listJogos);

		DefaultListModel<String> modelJogos = new DefaultListModel<String>();

		listJogos.setModel(modelJogos);

		JogoRepository jogos = new JogoRepository();

		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fabricanteRepository = new FabricanteRepository();
				
				fabricante = fabricanteRepository.getArray();
				
				
				for(int i = 0; i <= fabricante.length; i++) {
				
					if(i <= 3) {
					//System.out.println(fabricante[i].getEmpresa());
					
				
				
						
					}
					
				}

				Jogo jogo = new Jogo();
				jogo.setTitulo(txtTitulo.getText());

				jogo.setConsole(determinarConsole(comboConsole.getSelectedIndex()));

				System.out.println(comboConsole.getSelectedIndex());
				System.out.println(comboConsole.getSelectedItem());

				jogos.gravar(jogo, posicao);
				posicao++;

			}
		});
		listJogos.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {

				Jogo jogo = jogos.listarJogos(listJogos.getSelectedIndex());
				txtTitulo.setText(jogo.getTitulo());
				txtValor.setText(jogo.getValorEstimado());
				txtObservacoes.setText(jogo.getObservacoes());

				comboConsole.setSelectedIndex(jogo.getConsole().ordinal());
			}
		});

	}

	private Console determinarConsole(int selecionarConsole) {
		if (selecionarConsole == 0) {
			return Console.XBOX;
		}else if (selecionarConsole == 1) {
			return Console.PLAYSTATION;
		}else if (selecionarConsole == 2) {
			return Console.NITENDOSWITCH;
			
		}else {
			return Console.MEGADRIVE;
		}
	}

}
