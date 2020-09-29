package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DAO.UsuarioDAO;
import Models.Usuario;

public class Login {

	private JFrame frame;
	private JTextField usernameTF;
	private JPasswordField passwordPF;
	private JLabel usuarioLabel;
	private JLabel passwordLabel;
	private JButton btnLogin;
	private UsuarioDAO usuarioDAO;

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		usuarioDAO = new UsuarioDAO();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		setUIComponents();
		setControllers();
	}
	
	/**
	 * Devuelve un objecto Usuario con los valores de las cajas de texto de la UI.
	 * @return El objeto Usuario con los valores de la vista.
	 */
	private Usuario createUsuario() {
		String username = usernameTF.getText();
		String password = new String(passwordPF.getPassword());
		return new Usuario(username, password);		
	}
	
	private void setUIComponents() {
		usernameTF = new JTextField();
		usernameTF.setToolTipText("usuario");
		usernameTF.setBounds(158, 104, 130, 26);
		frame.getContentPane().add(usernameTF);
		usernameTF.setColumns(10);
		
		passwordPF = new JPasswordField();
		passwordPF.setToolTipText("password");
		passwordPF.setBounds(158, 141, 130, 26);
		frame.getContentPane().add(passwordPF);
		
		usuarioLabel = new JLabel("Usuario");
		usuarioLabel.setBounds(70, 109, 61, 16);
		frame.getContentPane().add(usuarioLabel);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(70, 146, 61, 16);
		frame.getContentPane().add(passwordLabel);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(143, 195, 117, 29);
		frame.getContentPane().add(btnLogin);
		frame.setVisible(true);
	}
	
	private void setControllers() {
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario = createUsuario();
				
				if(usuarioDAO.Login(usuario)) {
					System.out.println("Login correcto");					
				} else {
					System.out.println("INCORRECTO");
				}
			}
		});
	}
}
