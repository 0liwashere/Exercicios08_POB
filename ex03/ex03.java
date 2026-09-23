public class Notificacao {
    protected String destinatario;

    public Notificacao(String destinatario) {
        this.destinatario = destinatario;
    }

    public void enviar(String mensagem) {
        System.out.println("Enviando notificação genérica para " + destinatario + ": " + mensagem);
    }
}

public class EmailNotificacao extends Notificacao {
    public EmailNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando E-mail para " + destinatario + ": " + mensagem);
    }
}

public class SmsNotificacao extends Notificacao {
    public SmsNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS para o número " + destinatario + ": " + mensagem);
    }
}

public class PushNotificacao extends Notificacao {
    public PushNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando Push Notification para o dispositivo " + destinatario + ": " + mensagem);
    }
}
