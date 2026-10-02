/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Image;
import java.time.LocalDate;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ArthurAquino
 */
public class Signos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Signos.class.getName());

    /**
     * Creates new form Signos
     */
    Clip musica;
    
    public Signos() {
        initComponents();
        RedimensionarImagens();
        PreencherPrevisao();
        PreencherMensagem();
        CorrigirAreasTexto();
    }
    
    //toda função é Criada abaixo do construtor
    
    public void RedimensionarImagens(){
        //capturar as img que estao dentro da label aries
        ImageIcon aries = (ImageIcon) imgSignoAries.getIcon();
        ImageIcon touro = (ImageIcon) imgSignoTouro.getIcon();
        ImageIcon gemeos = (ImageIcon) imgSignoGemeos.getIcon();
        ImageIcon cancer = (ImageIcon) imgSignoCancer.getIcon();
        ImageIcon leao = (ImageIcon) imgSignoLeao.getIcon();
        ImageIcon virgem = (ImageIcon) imgSignoVirgem.getIcon();
        ImageIcon libra = (ImageIcon) imgSignoLibra.getIcon();
        ImageIcon escorpiao = (ImageIcon) imgSignoEscorpiao.getIcon();
        ImageIcon aquario = (ImageIcon) imgSignoAquario.getIcon();
        ImageIcon peixes = (ImageIcon) imgSignoPeixes.getIcon();
        
        
        //redimensionaro tamanho delas
        Image imgAries = aries.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        Image imgTouro = touro.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        Image imgGemeos = gemeos.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        Image imgCancer = cancer.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);  
        Image imgLeao = leao.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        Image imgVirgem = virgem.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        Image imgLibra = libra.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        Image imgEscorpiao = escorpiao.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        Image imgAquario = aquario.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH); 
        Image imgPeixes = peixes.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        
        
        //JOGAR A IMG REDIMENSIONADA NA LABEL NOVAMENTE
        imgSignoAries.setIcon(new ImageIcon (imgAries));
        imgSignoTouro.setIcon(new ImageIcon (imgTouro));
        imgSignoGemeos.setIcon(new ImageIcon (imgGemeos));
        imgSignoCancer.setIcon(new ImageIcon (imgCancer));
        imgSignoLeao.setIcon(new ImageIcon (imgLeao));
        imgSignoVirgem.setIcon(new ImageIcon (imgVirgem));
        imgSignoEscorpiao.setIcon(new ImageIcon (imgEscorpiao));
        imgSignoAquario.setIcon(new ImageIcon (imgAquario));
        imgSignoPeixes.setIcon(new ImageIcon (imgPeixes));
        //redimensionaro tamanho delas
        
        
        //JOGAR A IMG REDIMENSIONADA NA LABEL NOVAMENTE
        
        
       
        
        //redimensionaro tamanho delas
        
        
        //JOGAR A IMG REDIMENSIONADA NA LABEL NOVAMENTE
        
        
        
        
        //redimensionaro tamanho delas
        
        
        //JOGAR A IMG REDIMENSIONADA NA LABEL NOVAMENTE
        
        
        
        
        //redimensionaro tamanho delas
        
        
       
        
        
        
        //redimensionaro tamanho delas
       
        
         //JOGAR A IMG REDIMENSIONADA NA LABEL NOVAMENTE
        
        
        //JOGAR A IMG REDIMENSIONADA NA LABEL NOVAMENTE
        
        
        
        
        //redimensionaro tamanho delas
        
        
        
       
        
        
        //redimensionaro tamanho delas
        
        
        //JOGAR A IMG REDIMENSIONADA NA LABEL NOVAMENTE
        
        
        
        
        
        
        
       
        
    }//fim da funçao
    
    public void PreencherPrevisao(){
        //verificar o dia da semana
        // LocalDate - puxa a data do computador
        int diaSemana = LocalDate.now().getDayOfWeek().getValue();
        
        //CRIAR A CONDICIONAL PARA PREENCHER O CAMPO PREVISAO.
     
        switch (diaSemana) {

            case 1:
                txtPrevisaoAries.setText("Comece a semana com coragem e iniciativa.");
                txtPrevisaoTouro.setText("Comece a semana com calma e organize seus planos.");
                txtPrevisaoGemeos.setText("Uma ideia nova pode mudar seu dia.");
                txtPrevisaoCancer.setText("Comece a semana cuidando mais de você.");
                txtPrevisaoLeao.setText("Comece a semana com confiança.");
                txtPrevisaoVirgem.setText("Organize suas tarefas e comece com foco.");
                txtPrevisaoLibra.setText("Busque equilíbrio para começar bem a semana.");
                txtPrevisaoEscorpiao.setText("Comece a semana determinado a alcançar seus objetivos.");
                txtPrevisaoSagitario.setText("Comece a semana com otimismo.");
                txtPrevisaoCapricornio.setText("Foco e organização serão seus aliados.");
                txtPrevisaoAquario.setText("Uma ideia diferente pode trazer bons resultados.");
                txtPrevisaoPeixes.setText("Confie na sua intuição para começar a semana.");
                break;

            case 2:
                txtPrevisaoAries.setText("Sua energia estará alta para novos desafios.");
                txtPrevisaoTouro.setText("Um bom dia para resolver pendências.");
                txtPrevisaoGemeos.setText("Sua comunicação estará em destaque.");
                txtPrevisaoCancer.setText("Uma conversa pode melhorar seu dia.");
                txtPrevisaoLeao.setText("Seu esforço poderá ser reconhecido.");
                txtPrevisaoVirgem.setText("Atenção aos detalhes fará diferença.");
                txtPrevisaoLibra.setText("Uma conversa agradável pode surgir.");
                txtPrevisaoEscorpiao.setText("Confie mais no seu potencial.");
                txtPrevisaoSagitario.setText("Uma novidade pode animar seu dia.");
                txtPrevisaoCapricornio.setText("Seu esforço poderá trazer bons resultados.");
                txtPrevisaoAquario.setText("Sua criatividade estará em alta.");
                txtPrevisaoPeixes.setText("Um momento tranquilo pode melhorar seu dia.");
                break;

            case 3:
                txtPrevisaoAries.setText("Tenha paciência antes de tomar decisões.");
                txtPrevisaoTouro.setText("Tenha paciência e evite decisões apressadas.");
                txtPrevisaoGemeos.setText("Converse e esclareça possíveis dúvidas.");
                txtPrevisaoCancer.setText("Confie mais na sua intuição.");
                txtPrevisaoLeao.setText("Mostre suas ideias sem medo.");
                txtPrevisaoVirgem.setText("Evite cobrar demais de si mesmo.");
                txtPrevisaoLibra.setText("Evite ficar indeciso diante das escolhas.");
                txtPrevisaoEscorpiao.setText("Evite guardar preocupações para você.");
                txtPrevisaoSagitario.setText("Evite agir por impulso.");
                txtPrevisaoCapricornio.setText("Tenha paciência com situações difíceis.");
                txtPrevisaoAquario.setText("Evite se afastar de quem se importa com você.");
                txtPrevisaoPeixes.setText("Evite pensar demais em pequenos problemas.");
                break;

            case 4:
                txtPrevisaoAries.setText("Boas oportunidades podem aparecer hoje.");
                txtPrevisaoTouro.setText("Boas oportunidades podem surgir no trabalho.");
                txtPrevisaoGemeos.setText("Bom momento para aprender algo novo.");
                txtPrevisaoCancer.setText("Evite preocupações desnecessárias.");
                txtPrevisaoLeao.setText("Um novo desafio pode aparecer.");
                txtPrevisaoVirgem.setText("Um bom resultado pode surgir do seu esforço.");
                txtPrevisaoLibra.setText("Boas notícias podem aparecer no trabalho.");
                txtPrevisaoEscorpiao.setText("Uma oportunidade pode chamar sua atenção.");
                txtPrevisaoSagitario.setText("Bom dia para experimentar algo diferente.");
                txtPrevisaoCapricornio.setText("Um objetivo pode ficar mais próximo.");
                txtPrevisaoAquario.setText("Bom momento para iniciar novos projetos.");
                txtPrevisaoPeixes.setText("Sua criatividade poderá trazer boas ideias.");
                break;

            case 5:
                txtPrevisaoAries.setText("No amor, demonstre seus sentimentos.");
                txtPrevisaoTouro.setText("Valorize os momentos ao lado de quem você gosta.");
                txtPrevisaoGemeos.setText("Uma boa conversa pode aproximar alguém.");
                txtPrevisaoCancer.setText("Um momento especial pode acontecer no amor.");
                txtPrevisaoLeao.setText("No amor, demonstre seus sentimentos.");
                txtPrevisaoVirgem.setText("Deixe um pouco as preocupações de lado.");
                txtPrevisaoLibra.setText("O amor pode trazer momentos especiais.");
                txtPrevisaoEscorpiao.setText("A sinceridade será importante no amor.");
                txtPrevisaoSagitario.setText("Uma boa oportunidade pode aparecer.");
                txtPrevisaoCapricornio.setText("Reserve um tempo para quem você ama.");
                txtPrevisaoAquario.setText("Uma conversa pode aproximar alguém especial.");
                txtPrevisaoPeixes.setText("O amor estará favorecido hoje.");
                break;

            case 6:
                txtPrevisaoAries.setText("Aproveite o dia para se divertir.");
                txtPrevisaoTouro.setText("Aproveite o dia para descansar e recarregar as energias.");
                txtPrevisaoGemeos.setText("Um passeio pode trazer boas surpresas.");
                txtPrevisaoCancer.setText("Fique perto de pessoas que fazem bem a você.");
                txtPrevisaoLeao.setText("Aproveite o dia para se divertir.");
                txtPrevisaoVirgem.setText("Aproveite o tempo livre para relaxar.");
                txtPrevisaoLibra.setText("Faça algo que realmente lhe traga alegria.");
                txtPrevisaoEscorpiao.setText("Deixe os problemas de lado e aproveite o dia.");
                txtPrevisaoSagitario.setText("Aproveite para sair da rotina.");
                txtPrevisaoCapricornio.setText("Relaxe um pouco e aproveite o seu tempo.");
                txtPrevisaoAquario.setText("Faça algo diferente e aproveite o dia.");
                txtPrevisaoPeixes.setText("Aproveite para fazer algo que você gosta.");
                break;

            case 7:
                txtPrevisaoAries.setText("Prepare-se para uma nova semana.");
                txtPrevisaoTouro.setText("Prepare-se para uma nova semana com tranquilidade.");
                txtPrevisaoGemeos.setText("Relaxe e organize suas ideias para a semana.");
                txtPrevisaoCancer.setText("Descanse e recupere suas energias.");
                txtPrevisaoLeao.setText("Recarregue as energias para a próxima semana.");
                txtPrevisaoVirgem.setText("Planeje tranquilamente os próximos dias.");
                txtPrevisaoLibra.setText("Um dia tranquilo ajudará a renovar suas energias.");
                txtPrevisaoEscorpiao.setText("Prepare-se para começar uma nova fase.");
                txtPrevisaoSagitario.setText("Descanse e pense nos próximos objetivos.");
                txtPrevisaoCapricornio.setText("Organize seus planos para a próxima semana.");
                txtPrevisaoAquario.setText("Use o dia para descansar e refletir.");
                txtPrevisaoPeixes.setText("Descanse e prepare-se para uma nova semana.");
                break;
        }
        
    }
    
    public void PreencherMensagem(){


        // CAPTURA DIA DA SEMANA
        int diaSemana = LocalDate.now().getDayOfWeek().getValue();

        // CONDICIONAL
        switch (diaSemana) {

            // SEGUNDA-FEIRA
            case 1:
                txtMensagemAries.setText("Comece a semana com coragem e determinação.");
                txtMensagemTouro.setText("Tenha paciência e confie no seu ritmo.");
                txtMensagemGemeos.setText("Uma boa conversa pode trazer novas oportunidades.");
                txtMensagemCancer.setText("Valorize as pessoas que fazem você se sentir bem.");
                txtMensagemLeao.setText("Mostre sua criatividade e aproveite o início da semana.");
                txtMensagemVirgem.setText("Organização será importante para alcançar seus objetivos.");
                txtMensagemLibra.setText("Procure equilíbrio entre suas responsabilidades e seu descanso.");
                txtMensagemEscorpiao.setText("Confie na sua intuição para tomar decisões.");
                txtMensagemSagitario.setText("Mantenha o entusiasmo e pense em novas possibilidades.");
                txtMensagemCapricornio.setText("Foco e disciplina ajudarão você a avançar.");
                txtMensagemAquario.setText("Uma ideia diferente pode transformar seu dia.");
                txtMensagemPeixes.setText("Use sua sensibilidade para perceber boas oportunidades.");
                break;

            // TERÇA-FEIRA
            case 2:
                txtMensagemAries.setText("Sua energia está em alta, aproveite para colocar planos em prática.");
                txtMensagemTouro.setText("Evite pressa e faça cada tarefa com atenção.");
                txtMensagemGemeos.setText("Sua comunicação estará favorecida hoje.");
                txtMensagemCancer.setText("Um momento tranquilo pode renovar suas energias.");
                txtMensagemLeao.setText("Confie em suas capacidades e não tenha medo de se destacar.");
                txtMensagemVirgem.setText("Pequenos detalhes podem fazer uma grande diferença.");
                txtMensagemLibra.setText("Tente resolver conflitos através do diálogo.");
                txtMensagemEscorpiao.setText("Hoje é um bom dia para deixar para trás aquilo que não ajuda.");
                txtMensagemSagitario.setText("Uma novidade pode deixar seu dia mais interessante.");
                txtMensagemCapricornio.setText("Continue firme, pois seus esforços estão fazendo diferença.");
                txtMensagemAquario.setText("Compartilhe suas ideias e esteja aberto a opiniões diferentes.");
                txtMensagemPeixes.setText("Reserve um tempo para fazer algo que você gosta.");
                break;

            // QUARTA-FEIRA
            case 3:
                txtMensagemAries.setText("Mantenha a calma e escolha bem suas batalhas.");
                txtMensagemTouro.setText("Persistência será sua maior aliada hoje.");
                txtMensagemGemeos.setText("Novos conhecimentos podem despertar sua curiosidade.");
                txtMensagemCancer.setText("Aproxime-se de quem transmite boas energias.");
                txtMensagemLeao.setText("Sua confiança pode inspirar outras pessoas.");
                txtMensagemVirgem.setText("Concentre-se no que realmente precisa ser resolvido.");
                txtMensagemLibra.setText("Evite decisões impulsivas e pense antes de agir.");
                txtMensagemEscorpiao.setText("Sua determinação ajudará você a superar obstáculos.");
                txtMensagemSagitario.setText("Mantenha a mente aberta para novas experiências.");
                txtMensagemCapricornio.setText("Um passo de cada vez também leva você aos seus objetivos.");
                txtMensagemAquario.setText("Use sua criatividade para encontrar soluções.");
                txtMensagemPeixes.setText("Escute seus sentimentos, mas também observe os fatos.");
                break;

            // QUINTA-FEIRA
            case 4:
                txtMensagemAries.setText("Uma atitude positiva pode mudar completamente seu dia.");
                txtMensagemTouro.setText("Valorize suas conquistas, mesmo as pequenas.");
                txtMensagemGemeos.setText("Conversas importantes podem abrir novos caminhos.");
                txtMensagemCancer.setText("Cuide de si mesmo e respeite seus limites.");
                txtMensagemLeao.setText("Sua presença será percebida, então aproveite para brilhar.");
                txtMensagemVirgem.setText("Planejamento e dedicação trarão bons resultados.");
                txtMensagemLibra.setText("Busque harmonia e evite discussões desnecessárias.");
                txtMensagemEscorpiao.setText("Não tenha medo de mudar aquilo que já não funciona.");
                txtMensagemSagitario.setText("Seu otimismo pode ajudar a superar um desafio.");
                txtMensagemCapricornio.setText("Continue trabalhando com responsabilidade e confiança.");
                txtMensagemAquario.setText("Uma ideia inesperada pode ser exatamente o que você precisava.");
                txtMensagemPeixes.setText("Sua criatividade estará especialmente presente hoje.");
                break;

            // SEXTA-FEIRA
            case 5:
                txtMensagemAries.setText("Finalize a semana com energia e satisfação pelo que realizou.");
                txtMensagemTouro.setText("Aproveite o dia para desacelerar e reconhecer seus esforços.");
                txtMensagemGemeos.setText("Um encontro ou conversa pode deixar seu dia mais divertido.");
                txtMensagemCancer.setText("Aproveite momentos agradáveis ao lado de pessoas queridas.");
                txtMensagemLeao.setText("Hoje combina com diversão, criatividade e bons momentos.");
                txtMensagemVirgem.setText("Depois de cumprir suas tarefas, permita-se descansar.");
                txtMensagemLibra.setText("Procure aproveitar o dia cercado de boas companhias.");
                txtMensagemEscorpiao.setText("Deixe as preocupações de lado e aproveite o presente.");
                txtMensagemSagitario.setText("O clima do dia favorece diversão e novas experiências.");
                txtMensagemCapricornio.setText("Você merece reconhecer tudo o que conseguiu realizar.");
                txtMensagemAquario.setText("Quebre a rotina e faça algo diferente hoje.");
                txtMensagemPeixes.setText("Aproveite o dia para relaxar e recarregar suas energias.");
                break;

            // SÁBADO
            case 6:
                txtMensagemAries.setText("Aproveite sua energia para fazer algo que realmente gosta.");
                txtMensagemTouro.setText("Um dia tranquilo pode ser exatamente o que você precisa.");
                txtMensagemGemeos.setText("Procure novas experiências e aproveite boas conversas.");
                txtMensagemCancer.setText("Passe um tempo com pessoas que fazem você se sentir bem.");
                txtMensagemLeao.setText("Divirta-se e aproveite para mostrar seu lado criativo.");
                txtMensagemVirgem.setText("Não deixe as preocupações impedirem seu descanso.");
                txtMensagemLibra.setText("Um programa agradável pode trazer equilíbrio ao seu dia.");
                txtMensagemEscorpiao.setText("Use o dia para renovar suas energias e organizar seus pensamentos.");
                txtMensagemSagitario.setText("Uma aventura inesperada pode tornar o sábado especial.");
                txtMensagemCapricornio.setText("Descanse sem culpa e aproveite seu tempo livre.");
                txtMensagemAquario.setText("Faça algo diferente e saia um pouco da rotina.");
                txtMensagemPeixes.setText("Sua imaginação pode transformar um dia simples em algo especial.");
                break;

            // DOMINGO
            case 7:
                txtMensagemAries.setText("Use o domingo para recuperar as energias para a próxima semana.");
                txtMensagemTouro.setText("Descanse e aproveite os pequenos prazeres do dia.");
                txtMensagemGemeos.setText("Uma conversa descontraída pode deixar seu domingo melhor.");
                txtMensagemCancer.setText("Família e pessoas queridas podem trazer conforto hoje.");
                txtMensagemLeao.setText("Aproveite o dia para se divertir e cuidar de você.");
                txtMensagemVirgem.setText("Organize seus pensamentos, mas não esqueça de descansar.");
                txtMensagemLibra.setText("Procure passar o dia em um ambiente tranquilo e agradável.");
                txtMensagemEscorpiao.setText("Deixe o passado de lado e prepare-se para uma nova semana.");
                txtMensagemSagitario.setText("Mantenha o otimismo e pense nas possibilidades que vêm pela frente.");
                txtMensagemCapricornio.setText("Planeje a próxima semana sem esquecer de aproveitar o presente.");
                txtMensagemAquario.setText("Use o domingo para pensar em novas ideias e projetos.");
                txtMensagemPeixes.setText("Relaxe, cuide de suas emoções e aproveite a tranquilidade do dia.");
                break;
        

        }//fim do do switch
        
    }//fim do preencher mensagem
    
    public void CorrigirAreasTexto(){
              // CORRIGIR MENSAGEM
       txtMensagemAries.setLineWrap(true);
       txtMensagemAries.setWrapStyleWord(true);

       txtMensagemTouro.setLineWrap(true);
       txtMensagemTouro.setWrapStyleWord(true);

       txtMensagemGemeos.setLineWrap(true);
       txtMensagemGemeos.setWrapStyleWord(true);

       txtMensagemCancer.setLineWrap(true);
       txtMensagemCancer.setWrapStyleWord(true);

       txtMensagemLeao.setLineWrap(true);
       txtMensagemLeao.setWrapStyleWord(true);

       txtMensagemVirgem.setLineWrap(true);
       txtMensagemVirgem.setWrapStyleWord(true);

       txtMensagemLibra.setLineWrap(true);
       txtMensagemLibra.setWrapStyleWord(true);

       txtMensagemEscorpiao.setLineWrap(true);
       txtMensagemEscorpiao.setWrapStyleWord(true);

       txtMensagemSagitario.setLineWrap(true);
       txtMensagemSagitario.setWrapStyleWord(true);

       txtMensagemCapricornio.setLineWrap(true);
       txtMensagemCapricornio.setWrapStyleWord(true);

       txtMensagemAquario.setLineWrap(true);
       txtMensagemAquario.setWrapStyleWord(true);

       txtMensagemPeixes.setLineWrap(true);
       txtMensagemPeixes.setWrapStyleWord(true);


       // CORRIGIR PREVISAO
       txtPrevisaoAries.setLineWrap(true);
       txtPrevisaoAries.setWrapStyleWord(true);

       txtPrevisaoTouro.setLineWrap(true);
       txtPrevisaoTouro.setWrapStyleWord(true);

       txtPrevisaoGemeos.setLineWrap(true);
       txtPrevisaoGemeos.setWrapStyleWord(true);

       txtPrevisaoCancer.setLineWrap(true);
       txtPrevisaoCancer.setWrapStyleWord(true);

       txtPrevisaoLeao.setLineWrap(true);
       txtPrevisaoLeao.setWrapStyleWord(true);

       txtPrevisaoVirgem.setLineWrap(true);
       txtPrevisaoVirgem.setWrapStyleWord(true);

       txtPrevisaoLibra.setLineWrap(true);
       txtPrevisaoLibra.setWrapStyleWord(true);

       txtPrevisaoEscorpiao.setLineWrap(true);
       txtPrevisaoEscorpiao.setWrapStyleWord(true);

       txtPrevisaoSagitario.setLineWrap(true);
       txtPrevisaoSagitario.setWrapStyleWord(true);

       txtPrevisaoCapricornio.setLineWrap(true);
       txtPrevisaoCapricornio.setWrapStyleWord(true);

       txtPrevisaoAquario.setLineWrap(true);
       txtPrevisaoAquario.setWrapStyleWord(true);

       txtPrevisaoPeixes.setLineWrap(true);
       txtPrevisaoPeixes.setWrapStyleWord(true);


       // CORRIGIR PONTOS FORTES
       txFortesAries.setLineWrap(true);
       txFortesAries.setWrapStyleWord(true);

       txFortesTouro.setLineWrap(true);
       txFortesTouro.setWrapStyleWord(true);

       txFortesGemeos.setLineWrap(true);
       txFortesGemeos.setWrapStyleWord(true);

       txFortesCancer.setLineWrap(true);
       txFortesCancer.setWrapStyleWord(true);

       txFortesLeao.setLineWrap(true);
       txFortesLeao.setWrapStyleWord(true);

       txFortesVirgem.setLineWrap(true);
       txFortesVirgem.setWrapStyleWord(true);

       txFortesLibra.setLineWrap(true);
       txFortesLibra.setWrapStyleWord(true);

       txFortesEscorpiao.setLineWrap(true);
       txFortesEscorpiao.setWrapStyleWord(true);

       txFortesSagitario.setLineWrap(true);
       txFortesSagitario.setWrapStyleWord(true);

       txFortesCapricornio.setLineWrap(true);
       txFortesCapricornio.setWrapStyleWord(true);

       txFortesAquario.setLineWrap(true);
       txFortesAquario.setWrapStyleWord(true);

       txFortesPeixes.setLineWrap(true);
       txFortesPeixes.setWrapStyleWord(true);


       // CORRIGIR PONTOS A MELHORAR
       txMelhorarAries.setLineWrap(true);
       txMelhorarAries.setWrapStyleWord(true);

       txMelhorarTouro.setLineWrap(true);
       txMelhorarTouro.setWrapStyleWord(true);

       txMelhorarGemeos.setLineWrap(true);
       txMelhorarGemeos.setWrapStyleWord(true);

       txMelhorarCancer.setLineWrap(true);
       txMelhorarCancer.setWrapStyleWord(true);

       txMelhorarLeao.setLineWrap(true);
       txMelhorarLeao.setWrapStyleWord(true);

       txMelhorarVirgem.setLineWrap(true);
       txMelhorarVirgem.setWrapStyleWord(true);

       txMelhorarLibra.setLineWrap(true);
       txMelhorarLibra.setWrapStyleWord(true);

       txMelhorarEscorpiao.setLineWrap(true);
       txMelhorarEscorpiao.setWrapStyleWord(true);

       txMelhorarSagitario.setLineWrap(true);
       txMelhorarSagitario.setWrapStyleWord(true);

       txMelhorarCapricornio.setLineWrap(true);
       txMelhorarCapricornio.setWrapStyleWord(true);

       txMelhorarAquario.setLineWrap(true);
       txMelhorarAquario.setWrapStyleWord(true);

       txMelhorarPeixes.setLineWrap(true);
       txMelhorarPeixes.setWrapStyleWord(true);    
        
        
        
        
    }// FIM DO METODO
    
    public void CalcularSigno(){ 
    // capturar dados da combobox 
    int dia = Integer.parseInt(cbDia.getSelectedItem().toString()); 
    String mes = cbMes.getSelectedItem().toString(); 
    ImageIcon imagem = null; 
     
    // verificar dia e mes dos signos com if else 
    if((mes.equalsIgnoreCase("Março") && dia >= 21) || 
            (mes.equalsIgnoreCase("Abril") && dia <= 19)){ 
        signo.setText("Áries");
        imagem = (ImageIcon) imgSignoAries.getIcon();
     
    }else if((mes.equalsIgnoreCase("Abril") && dia >= 20) || 
            (mes.equalsIgnoreCase("Maio") && dia <= 20)){ 
        signo.setText("Touro");
        imagem = (ImageIcon) imgSignoTouro.getIcon();
     
    }else if((mes.equalsIgnoreCase("Maio") && dia >= 21) || 
            (mes.equalsIgnoreCase("Junho") && dia <= 20)){ 
        signo.setText("Gêmeos");
        imagem = (ImageIcon) imgSignoGemeos.getIcon();
     
    }else if((mes.equalsIgnoreCase("Junho") && dia >= 21) || 
            (mes.equalsIgnoreCase("Julho") && dia <= 22)){ 
        signo.setText("Câncer");
        imagem = (ImageIcon) imgSignoCancer.getIcon();
     
    }else if((mes.equalsIgnoreCase("Julho") && dia >= 23) || 
            (mes.equalsIgnoreCase("Agosto") && dia <= 22)){ 
        signo.setText("Leão");
        imagem = (ImageIcon) imgSignoLeao.getIcon();
     
    }else if((mes.equalsIgnoreCase("Agosto") && dia >= 23) || 
            (mes.equalsIgnoreCase("Setembro") && dia <= 22)){ 
        signo.setText("Virgem");
        imagem = (ImageIcon) imgSignoVirgem.getIcon();
     
    }else if((mes.equalsIgnoreCase("Setembro") && dia >= 23) || 
            (mes.equalsIgnoreCase("Outubro") && dia <= 22)){ 
        signo.setText("Libra");
        imagem = (ImageIcon) imgSignoLibra.getIcon();
     
    }else if((mes.equalsIgnoreCase("Outubro") && dia >= 23) || 
            (mes.equalsIgnoreCase("Novembro") && dia <= 21)){ 
        signo.setText("Escorpião");
        imagem = (ImageIcon) imgSignoEscorpiao.getIcon();
     
    }else if((mes.equalsIgnoreCase("Novembro") && dia >= 22) || 
            (mes.equalsIgnoreCase("Dezembro") && dia <= 21)){ 
        signo.setText("Sagitário");
        imagem = (ImageIcon) imgSignoSagitario.getIcon();
     
    }else if((mes.equalsIgnoreCase("Dezembro") && dia >= 22) || 
            (mes.equalsIgnoreCase("Janeiro") && dia <= 19)){ 
        signo.setText("Capricórnio");
        imagem = (ImageIcon) imgSignoCapricornio.getIcon();
     
    }else if((mes.equalsIgnoreCase("Janeiro") && dia >= 20) || 
            (mes.equalsIgnoreCase("Fevereiro") && dia <= 18)){ 
        signo.setText("Aquário");
        imagem = (ImageIcon) imgSignoAquario.getIcon();
     
    }else if((mes.equalsIgnoreCase("Fevereiro") && dia >= 19) || 
            (mes.equalsIgnoreCase("Março") && dia <= 20)){ 
        signo.setText("Peixes");
        imagem = (ImageIcon) imgSignoPeixes.getIcon();
    }

    Image imgRedimensionada = imagem.getImage().getScaledInstance(
           200, 200, Image.SCALE_SMOOTH);
    
    
    btnSigno.setIcon(new ImageIcon(imgRedimensionada));
    
    
    }
    
    public void CalcularCompatibilidade(){
    String signo1 = cbSigno1.getSelectedItem().toString();
    String signo2 = cbSigno2.getSelectedItem().toString();

    // ÁRIES
    if(signo1.equalsIgnoreCase("aries") &&
            signo2.equalsIgnoreCase("touro")){
        tfCompatibilidade.setText("70% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("aries") &&
            signo2.equalsIgnoreCase("gemeos")){
        tfCompatibilidade.setText("50% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("aries") &&
            signo2.equalsIgnoreCase("cancer")){
        tfCompatibilidade.setText("60% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("aries") &&
            signo2.equalsIgnoreCase("leao")){
        tfCompatibilidade.setText("90% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("aries") &&
            signo2.equalsIgnoreCase("virgem")){
        tfCompatibilidade.setText("55% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("aries") &&
            signo2.equalsIgnoreCase("libra")){
        tfCompatibilidade.setText("80% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("aries") &&
            signo2.equalsIgnoreCase("escorpiao")){
        tfCompatibilidade.setText("75% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("aries") &&
            signo2.equalsIgnoreCase("sagitario")){
        tfCompatibilidade.setText("95% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("aries") &&
            signo2.equalsIgnoreCase("capricornio")){
        tfCompatibilidade.setText("50% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("aries") &&
            signo2.equalsIgnoreCase("aquario")){
        tfCompatibilidade.setText("85% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("aries") &&
            signo2.equalsIgnoreCase("peixes")){
        tfCompatibilidade.setText("60% compatibilidade!");
    }

    // TOURO
    else if(signo1.equalsIgnoreCase("touro") &&
            signo2.equalsIgnoreCase("gemeos")){
        tfCompatibilidade.setText("55% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("touro") &&
            signo2.equalsIgnoreCase("cancer")){
        tfCompatibilidade.setText("90% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("touro") &&
            signo2.equalsIgnoreCase("leao")){
        tfCompatibilidade.setText("65% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("touro") &&
            signo2.equalsIgnoreCase("virgem")){
        tfCompatibilidade.setText("95% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("touro") &&
            signo2.equalsIgnoreCase("libra")){
        tfCompatibilidade.setText("70% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("touro") &&
            signo2.equalsIgnoreCase("escorpiao")){
        tfCompatibilidade.setText("80% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("touro") &&
            signo2.equalsIgnoreCase("sagitario")){
        tfCompatibilidade.setText("50% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("touro") &&
            signo2.equalsIgnoreCase("capricornio")){
        tfCompatibilidade.setText("95% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("touro") &&
            signo2.equalsIgnoreCase("aquario")){
        tfCompatibilidade.setText("45% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("touro") &&
            signo2.equalsIgnoreCase("peixes")){
        tfCompatibilidade.setText("85% compatibilidade!");
    }

    // GÊMEOS
    else if(signo1.equalsIgnoreCase("gemeos") &&
            signo2.equalsIgnoreCase("cancer")){
        tfCompatibilidade.setText("65% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("gemeos") &&
            signo2.equalsIgnoreCase("leao")){
        tfCompatibilidade.setText("85% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("gemeos") &&
            signo2.equalsIgnoreCase("virgem")){
        tfCompatibilidade.setText("70% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("gemeos") &&
            signo2.equalsIgnoreCase("libra")){
        tfCompatibilidade.setText("95% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("gemeos") &&
            signo2.equalsIgnoreCase("escorpiao")){
        tfCompatibilidade.setText("55% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("gemeos") &&
            signo2.equalsIgnoreCase("sagitario")){
        tfCompatibilidade.setText("90% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("gemeos") &&
            signo2.equalsIgnoreCase("capricornio")){
        tfCompatibilidade.setText("50% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("gemeos") &&
            signo2.equalsIgnoreCase("aquario")){
        tfCompatibilidade.setText("95% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("gemeos") &&
            signo2.equalsIgnoreCase("peixes")){
        tfCompatibilidade.setText("60% compatibilidade!");
    }

    // CÂNCER
    else if(signo1.equalsIgnoreCase("cancer") &&
            signo2.equalsIgnoreCase("leao")){
        tfCompatibilidade.setText("65% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("cancer") &&
            signo2.equalsIgnoreCase("virgem")){
        tfCompatibilidade.setText("80% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("cancer") &&
            signo2.equalsIgnoreCase("libra")){
        tfCompatibilidade.setText("60% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("cancer") &&
            signo2.equalsIgnoreCase("escorpiao")){
        tfCompatibilidade.setText("95% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("cancer") &&
            signo2.equalsIgnoreCase("sagitario")){
        tfCompatibilidade.setText("50% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("cancer") &&
            signo2.equalsIgnoreCase("capricornio")){
        tfCompatibilidade.setText("85% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("cancer") &&
            signo2.equalsIgnoreCase("aquario")){
        tfCompatibilidade.setText("55% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("cancer") &&
            signo2.equalsIgnoreCase("peixes")){
        tfCompatibilidade.setText("95% compatibilidade!");
    }

    // LEÃO
    else if(signo1.equalsIgnoreCase("leao") &&
            signo2.equalsIgnoreCase("virgem")){
        tfCompatibilidade.setText("60% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("leao") &&
            signo2.equalsIgnoreCase("libra")){
        tfCompatibilidade.setText("85% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("leao") &&
            signo2.equalsIgnoreCase("escorpiao")){
        tfCompatibilidade.setText("75% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("leao") &&
            signo2.equalsIgnoreCase("sagitario")){
        tfCompatibilidade.setText("95% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("leao") &&
            signo2.equalsIgnoreCase("capricornio")){
        tfCompatibilidade.setText("55% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("leao") &&
            signo2.equalsIgnoreCase("aquario")){
        tfCompatibilidade.setText("90% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("leao") &&
            signo2.equalsIgnoreCase("peixes")){
        tfCompatibilidade.setText("60% compatibilidade!");
    }

    // VIRGEM
    else if(signo1.equalsIgnoreCase("virgem") &&
            signo2.equalsIgnoreCase("libra")){
        tfCompatibilidade.setText("70% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("virgem") &&
            signo2.equalsIgnoreCase("escorpiao")){
        tfCompatibilidade.setText("85% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("virgem") &&
            signo2.equalsIgnoreCase("sagitario")){
        tfCompatibilidade.setText("55% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("virgem") &&
            signo2.equalsIgnoreCase("capricornio")){
        tfCompatibilidade.setText("95% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("virgem") &&
            signo2.equalsIgnoreCase("aquario")){
        tfCompatibilidade.setText("60% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("virgem") &&
            signo2.equalsIgnoreCase("peixes")){
        tfCompatibilidade.setText("80% compatibilidade!");
    }

    // LIBRA
    else if(signo1.equalsIgnoreCase("libra") &&
            signo2.equalsIgnoreCase("escorpiao")){
        tfCompatibilidade.setText("70% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("libra") &&
            signo2.equalsIgnoreCase("sagitario")){
        tfCompatibilidade.setText("85% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("libra") &&
            signo2.equalsIgnoreCase("capricornio")){
        tfCompatibilidade.setText("55% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("libra") &&
            signo2.equalsIgnoreCase("aquario")){
        tfCompatibilidade.setText("95% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("libra") &&
            signo2.equalsIgnoreCase("peixes")){
        tfCompatibilidade.setText("65% compatibilidade!");
    }

    // ESCORPIÃO
    else if(signo1.equalsIgnoreCase("escorpiao") &&
            signo2.equalsIgnoreCase("sagitario")){
        tfCompatibilidade.setText("65% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("escorpiao") &&
            signo2.equalsIgnoreCase("capricornio")){
        tfCompatibilidade.setText("85% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("escorpiao") &&
            signo2.equalsIgnoreCase("aquario")){
        tfCompatibilidade.setText("55% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("escorpiao") &&
            signo2.equalsIgnoreCase("peixes")){
        tfCompatibilidade.setText("95% compatibilidade!");
    }

    // SAGITÁRIO
    else if(signo1.equalsIgnoreCase("sagitario") &&
            signo2.equalsIgnoreCase("capricornio")){
        tfCompatibilidade.setText("60% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("sagitario") &&
            signo2.equalsIgnoreCase("aquario")){
        tfCompatibilidade.setText("90% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("sagitario") &&
            signo2.equalsIgnoreCase("peixes")){
        tfCompatibilidade.setText("65% compatibilidade!");
    }

    // CAPRICÓRNIO
    else if(signo1.equalsIgnoreCase("capricornio") &&
            signo2.equalsIgnoreCase("aquario")){
        tfCompatibilidade.setText("60% compatibilidade!");
    }else if(signo1.equalsIgnoreCase("capricornio") &&
            signo2.equalsIgnoreCase("peixes")){
        tfCompatibilidade.setText("90% compatibilidade!");
    }

    // AQUÁRIO
    else if(signo1.equalsIgnoreCase("aquario") &&
            signo2.equalsIgnoreCase("peixes")){
        tfCompatibilidade.setText("80% compatibilidade!");
    }

    // MESMO SIGNO
    else if(signo1.equalsIgnoreCase(signo2)){
        tfCompatibilidade.setText("85% compatibilidade!");
    }

}// fim do compatibilidade
    
    public void TocarMusica() {
    try {
        // Se a música já foi carregada, continuar a reprodução
        if (musica != null && musica.isOpen()) {
            musica.start();
            return;
        }

        // Localizar o arquivo dentro do projeto
        java.net.URL arquivo = getClass().getResource("/musica/musica.wav");

        if (arquivo == null) {
            JOptionPane.showMessageDialog(this, "Arquivo de música não encontrado!");
            return;
        }

        // Abrir o áudio e carregar a música
        try (AudioInputStream audio = AudioSystem.getAudioInputStream(arquivo)) {
            musica = AudioSystem.getClip();
            musica.open(audio);
        }

        // Iniciar a reprodução
        musica.start();

    } catch (Exception erro) {
        JOptionPane.showMessageDialog(
                this,
                "Erro ao tocar a música: " + erro.getMessage()
        );
    }
}// Fim do TocarMusica
    
    public void PausarMusica() {
    if (musica != null && musica.isOpen()) {
        // Pausar na posição atual
        musica.stop();
    }
}// Fim do PausarMusica
    
    public void PararMusica() {
    if (musica != null && musica.isOpen()) {
        // Parar e voltar ao início
        musica.stop();
        musica.setFramePosition(0);
    }
}// Fim do PararMusica

        
        
      
        
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        areaAbas = new javax.swing.JTabbedPane();
        inicio = new javax.swing.JPanel();
        areaDescobrirSigno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        btnDescobrirSigno = new javax.swing.JButton();
        areaComopatibilidade = new javax.swing.JPanel();
        tituloCompatibilidade = new javax.swing.JLabel();
        signo1 = new javax.swing.JLabel();
        signo2 = new javax.swing.JLabel();
        cbSigno1 = new javax.swing.JComboBox<>();
        cbSigno2 = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        areaResultado = new javax.swing.JPanel();
        signo = new javax.swing.JLabel();
        Compatibilidade = new javax.swing.JLabel();
        btnSigno = new javax.swing.JButton();
        tfCompatibilidade = new javax.swing.JTextField();
        btnPlay = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        fundoInicio = new javax.swing.JLabel();
        aries = new javax.swing.JPanel();
        areaCaracteristicasAries = new javax.swing.JPanel();
        tituloCaracteristicaAries = new javax.swing.JLabel();
        pfortesAries = new javax.swing.JLabel();
        pMelhorarAries = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txFortesAries = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txMelhorarAries = new javax.swing.JTextArea();
        areaInformacoesAries = new javax.swing.JPanel();
        imgSignoAries = new javax.swing.JLabel();
        tituloAries = new javax.swing.JLabel();
        periodoAries = new javax.swing.JLabel();
        elementoAries = new javax.swing.JLabel();
        planetaAries = new javax.swing.JLabel();
        corAries = new javax.swing.JLabel();
        numeroAries = new javax.swing.JLabel();
        tfPeriodoAries = new javax.swing.JTextField();
        tfElementoAries = new javax.swing.JTextField();
        tfPlanetaAries = new javax.swing.JTextField();
        tfCorAries = new javax.swing.JTextField();
        tfNumeroAries = new javax.swing.JTextField();
        areaPrevisaoAries = new javax.swing.JPanel();
        previsaoAries = new javax.swing.JLabel();
        txPrevisaoAries = new javax.swing.JScrollPane();
        txtPrevisaoAries = new javax.swing.JTextArea();
        btnAtualizarPrevisaoAries = new javax.swing.JButton();
        areaEnergiaAries = new javax.swing.JPanel();
        tituloEnergiaAries = new javax.swing.JLabel();
        trabalhoAries = new javax.swing.JLabel();
        sorteAries = new javax.swing.JLabel();
        amorAries = new javax.swing.JLabel();
        saudeAries = new javax.swing.JLabel();
        tfAmorAries = new javax.swing.JTextField();
        tfTrabalhoAries = new javax.swing.JTextField();
        tfSaudeAries = new javax.swing.JTextField();
        tfSorteAries = new javax.swing.JTextField();
        areaMensagemAries = new javax.swing.JPanel();
        tituloMensagemAries = new javax.swing.JLabel();
        txMensagemAries = new javax.swing.JScrollPane();
        txtMensagemAries = new javax.swing.JTextArea();
        btnCopiarMsgAries = new javax.swing.JButton();
        fundoAries = new javax.swing.JLabel();
        touro = new javax.swing.JPanel();
        areaCaracteristicasTouro = new javax.swing.JPanel();
        tituloCaracteristicaTouro = new javax.swing.JLabel();
        pfortesTouro = new javax.swing.JLabel();
        pMelhorarTouro = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txFortesTouro = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txMelhorarTouro = new javax.swing.JTextArea();
        areaInformacoesTouro = new javax.swing.JPanel();
        imgSignoTouro = new javax.swing.JLabel();
        tituloTouro = new javax.swing.JLabel();
        periodoTouro = new javax.swing.JLabel();
        elementoTouro = new javax.swing.JLabel();
        planetaTouro = new javax.swing.JLabel();
        corTouro = new javax.swing.JLabel();
        numeroTouro = new javax.swing.JLabel();
        tfPeriodoTouro = new javax.swing.JTextField();
        tfElementoTouro = new javax.swing.JTextField();
        tfPlanetaTouro = new javax.swing.JTextField();
        tfCorTouro = new javax.swing.JTextField();
        tfNumeroTouro = new javax.swing.JTextField();
        areaPrevisaoTouro = new javax.swing.JPanel();
        previsaoTouro = new javax.swing.JLabel();
        txPrevisaoTouro = new javax.swing.JScrollPane();
        txtPrevisaoTouro = new javax.swing.JTextArea();
        btnAtualizarPrevisaoTouro = new javax.swing.JButton();
        areaEnergiaTouro = new javax.swing.JPanel();
        tituloEnergiaTouro = new javax.swing.JLabel();
        trabalhoTouro = new javax.swing.JLabel();
        sorteTouro = new javax.swing.JLabel();
        amorTouro = new javax.swing.JLabel();
        saudeTouro = new javax.swing.JLabel();
        tfAmorTouro = new javax.swing.JTextField();
        tfTrabalhoTouro = new javax.swing.JTextField();
        tfSaudeTouro = new javax.swing.JTextField();
        tfSorteTouro = new javax.swing.JTextField();
        areaMensagemTouro = new javax.swing.JPanel();
        tituloMensagemTouro = new javax.swing.JLabel();
        txMensagemTouro = new javax.swing.JScrollPane();
        txtMensagemTouro = new javax.swing.JTextArea();
        btnCopiarMsgTouro = new javax.swing.JButton();
        fundoTouro = new javax.swing.JLabel();
        gemeos = new javax.swing.JPanel();
        areaCaracteristicasGemeos = new javax.swing.JPanel();
        tituloCaracteristicaGemeos = new javax.swing.JLabel();
        pfortesGemeos = new javax.swing.JLabel();
        pMelhorarGemeos = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txFortesGemeos = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txMelhorarGemeos = new javax.swing.JTextArea();
        areaInformacoesGemeos = new javax.swing.JPanel();
        imgSignoGemeos = new javax.swing.JLabel();
        tituloGemeos = new javax.swing.JLabel();
        periodoGemeos = new javax.swing.JLabel();
        elementoGemeos = new javax.swing.JLabel();
        planetaGemeos = new javax.swing.JLabel();
        corGemeos = new javax.swing.JLabel();
        numeroGemeos = new javax.swing.JLabel();
        tfPeriodoGemeos = new javax.swing.JTextField();
        tfElementoGemeos = new javax.swing.JTextField();
        tfPlanetaGemeos = new javax.swing.JTextField();
        tfCorGemeos = new javax.swing.JTextField();
        tfNumeroGemeos = new javax.swing.JTextField();
        areaPrevisaoGemeos = new javax.swing.JPanel();
        previsaoGemeos = new javax.swing.JLabel();
        txPrevisaoGemeos = new javax.swing.JScrollPane();
        txtPrevisaoGemeos = new javax.swing.JTextArea();
        btnAtualizarPrevisaoGemeos = new javax.swing.JButton();
        areaEnergiaGemeos = new javax.swing.JPanel();
        tituloEnergiaGemeos = new javax.swing.JLabel();
        trabalhoGemeos = new javax.swing.JLabel();
        sorteGemeos = new javax.swing.JLabel();
        amorGemeos = new javax.swing.JLabel();
        saudeGemeos = new javax.swing.JLabel();
        tfAmorGemeos = new javax.swing.JTextField();
        tfTrabalhoGemeos = new javax.swing.JTextField();
        tfSaudeGemeos = new javax.swing.JTextField();
        tfSorteGemeos = new javax.swing.JTextField();
        areaMensagemGemeos = new javax.swing.JPanel();
        tituloMensagemGemeos = new javax.swing.JLabel();
        txMensagemGemeos = new javax.swing.JScrollPane();
        txtMensagemGemeos = new javax.swing.JTextArea();
        btnCopiarMsgGemeos = new javax.swing.JButton();
        fundoGemeos = new javax.swing.JLabel();
        cancer = new javax.swing.JPanel();
        areaCaracteristicasCancer = new javax.swing.JPanel();
        tituloCaracteristicaCancer = new javax.swing.JLabel();
        pfortesCancer = new javax.swing.JLabel();
        pMelhorarCancer = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txFortesCancer = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txMelhorarCancer = new javax.swing.JTextArea();
        areaInformacoesCancer = new javax.swing.JPanel();
        imgSignoCancer = new javax.swing.JLabel();
        tituloCancer = new javax.swing.JLabel();
        periodoCancer = new javax.swing.JLabel();
        elementoCancer = new javax.swing.JLabel();
        planetaCancer = new javax.swing.JLabel();
        corCancer = new javax.swing.JLabel();
        numeroCancer = new javax.swing.JLabel();
        tfPeriodoCancer = new javax.swing.JTextField();
        tfElementoCancer = new javax.swing.JTextField();
        tfPlanetaCancer = new javax.swing.JTextField();
        tfCorCancer = new javax.swing.JTextField();
        tfNumeroCancer = new javax.swing.JTextField();
        areaPrevisaoCancer = new javax.swing.JPanel();
        previsaoCancer = new javax.swing.JLabel();
        txPrevisaoCancer = new javax.swing.JScrollPane();
        txtPrevisaoCancer = new javax.swing.JTextArea();
        btnAtualizarPrevisaoCancer = new javax.swing.JButton();
        areaEnergiaCancer = new javax.swing.JPanel();
        tituloEnergiaCancer = new javax.swing.JLabel();
        trabalhoCancer = new javax.swing.JLabel();
        sorteCancer = new javax.swing.JLabel();
        amorCancer = new javax.swing.JLabel();
        saudeCancer = new javax.swing.JLabel();
        tfAmorCancer = new javax.swing.JTextField();
        tfTrabalhoCancer = new javax.swing.JTextField();
        tfSaudeCancer = new javax.swing.JTextField();
        tfSorteCancer = new javax.swing.JTextField();
        areaMensagemCancer = new javax.swing.JPanel();
        tituloMensagemCancer = new javax.swing.JLabel();
        txMensagemCancer = new javax.swing.JScrollPane();
        btnCopiarMsgCancer = new javax.swing.JButton();
        txtMensagemCancer = new javax.swing.JTextArea();
        fundoCancer = new javax.swing.JLabel();
        leao = new javax.swing.JPanel();
        areaCaracteristicasLeao = new javax.swing.JPanel();
        tituloCaracteristicaLeao = new javax.swing.JLabel();
        pfortesLeao = new javax.swing.JLabel();
        pMelhorarLeao = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txFortesLeao = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txMelhorarLeao = new javax.swing.JTextArea();
        areaInformacoesLeao = new javax.swing.JPanel();
        imgSignoLeao = new javax.swing.JLabel();
        tituloLeao = new javax.swing.JLabel();
        periodoLeao = new javax.swing.JLabel();
        elementoLeao = new javax.swing.JLabel();
        planetaLeao = new javax.swing.JLabel();
        corLeao = new javax.swing.JLabel();
        numeroLeao = new javax.swing.JLabel();
        tfPeriodoLeao = new javax.swing.JTextField();
        tfElementoLeao = new javax.swing.JTextField();
        tfPlanetaLeao = new javax.swing.JTextField();
        tfCorLeao = new javax.swing.JTextField();
        tfNumeroLeao = new javax.swing.JTextField();
        areaPrevisaoLeao = new javax.swing.JPanel();
        previsaoLeao = new javax.swing.JLabel();
        txPrevisaoAries4 = new javax.swing.JScrollPane();
        txtPrevisaoLeao = new javax.swing.JTextArea();
        btnAtualizarPrevisaoLeao = new javax.swing.JButton();
        areaEnergiaLeao = new javax.swing.JPanel();
        tituloEnergiaLeao = new javax.swing.JLabel();
        trabalhoLeao = new javax.swing.JLabel();
        sorteLeao = new javax.swing.JLabel();
        amorLeao = new javax.swing.JLabel();
        saudeLeao = new javax.swing.JLabel();
        tfAmorLeao = new javax.swing.JTextField();
        tfTrabalhoLeao = new javax.swing.JTextField();
        tfSaudeLeao = new javax.swing.JTextField();
        tfSorteLeao = new javax.swing.JTextField();
        areaMensagemLeao = new javax.swing.JPanel();
        tituloMensagemLeao = new javax.swing.JLabel();
        txMensagemLeao = new javax.swing.JScrollPane();
        txtMensagemLeao = new javax.swing.JTextArea();
        btnCopiarMsgLeao = new javax.swing.JButton();
        fundoLeao = new javax.swing.JLabel();
        virgem = new javax.swing.JPanel();
        areaCaracteristicasVirgem = new javax.swing.JPanel();
        tituloCaracteristicaVirgem = new javax.swing.JLabel();
        pfortesVirgem = new javax.swing.JLabel();
        pMelhorarVirgem = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txFortesVirgem = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        txMelhorarVirgem = new javax.swing.JTextArea();
        areaInformacoesVirgem = new javax.swing.JPanel();
        imgSignoVirgem = new javax.swing.JLabel();
        tituloVirgem = new javax.swing.JLabel();
        periodoVirgem = new javax.swing.JLabel();
        elementoVirgem = new javax.swing.JLabel();
        planetaVirgem = new javax.swing.JLabel();
        corVirgem = new javax.swing.JLabel();
        numeroVirgem = new javax.swing.JLabel();
        tfPeriodoVirgem = new javax.swing.JTextField();
        tfElementoVirgem = new javax.swing.JTextField();
        tfPlanetaVirgem = new javax.swing.JTextField();
        tfCorVirgem = new javax.swing.JTextField();
        tfNumeroVirgem = new javax.swing.JTextField();
        areaPrevisaoVirgem = new javax.swing.JPanel();
        previsaoVirgem = new javax.swing.JLabel();
        txPrevisaoVirgem = new javax.swing.JScrollPane();
        txtPrevisaoVirgem = new javax.swing.JTextArea();
        btnAtualizarPrevisaoVirgem = new javax.swing.JButton();
        areaEnergiaVirgem = new javax.swing.JPanel();
        tituloEnergiaVirgem = new javax.swing.JLabel();
        trabalhoVirgem = new javax.swing.JLabel();
        sorteVirgem = new javax.swing.JLabel();
        amorVirgem = new javax.swing.JLabel();
        saudeVirgem = new javax.swing.JLabel();
        tfAmorVirgem = new javax.swing.JTextField();
        tfTrabalhoVirgem = new javax.swing.JTextField();
        tfSaudeVirgem = new javax.swing.JTextField();
        tfSorteVirgem = new javax.swing.JTextField();
        areaMensagemVirgem = new javax.swing.JPanel();
        tituloMensagemVirgem = new javax.swing.JLabel();
        txMensagemVirgem = new javax.swing.JScrollPane();
        txtMensagemVirgem = new javax.swing.JTextArea();
        btnCopiarMsgVirgem = new javax.swing.JButton();
        fundoVirgem = new javax.swing.JLabel();
        libra = new javax.swing.JPanel();
        areaCaracteristicasLibra = new javax.swing.JPanel();
        tituloCaracteristicaLibra = new javax.swing.JLabel();
        pfortesLibra = new javax.swing.JLabel();
        pMelhorarLibra = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txFortesLibra = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txMelhorarLibra = new javax.swing.JTextArea();
        areaInformacoesLibra = new javax.swing.JPanel();
        imgSignoLibra = new javax.swing.JLabel();
        tituloLibra = new javax.swing.JLabel();
        periodoLibra = new javax.swing.JLabel();
        elementoLibra = new javax.swing.JLabel();
        planetaLibra = new javax.swing.JLabel();
        corLibra = new javax.swing.JLabel();
        numeroLibra = new javax.swing.JLabel();
        tfPeriodoLibra = new javax.swing.JTextField();
        tfElementoLibra = new javax.swing.JTextField();
        tfPlanetaLibra = new javax.swing.JTextField();
        tfCorLibra = new javax.swing.JTextField();
        tfNumeroLibra = new javax.swing.JTextField();
        areaPrevisaoLibra = new javax.swing.JPanel();
        previsaoLibra = new javax.swing.JLabel();
        txPrevisaoLibra = new javax.swing.JScrollPane();
        txtPrevisaoLibra = new javax.swing.JTextArea();
        btnAtualizarPrevisaoLibra = new javax.swing.JButton();
        areaEnergiaLibra = new javax.swing.JPanel();
        tituloEnergiaLibra = new javax.swing.JLabel();
        trabalhoLibra = new javax.swing.JLabel();
        sorteLibra = new javax.swing.JLabel();
        amorLibra = new javax.swing.JLabel();
        saudeLibra = new javax.swing.JLabel();
        tfAmorLibra = new javax.swing.JTextField();
        tfTrabalhoLibra = new javax.swing.JTextField();
        tfSaudeLibra = new javax.swing.JTextField();
        tfSorteLibra = new javax.swing.JTextField();
        areaMensagemLibra = new javax.swing.JPanel();
        tituloMensagemLibra = new javax.swing.JLabel();
        txMensagemLibra = new javax.swing.JScrollPane();
        txtMensagemLibra = new javax.swing.JTextArea();
        btnCopiarMsgLibra = new javax.swing.JButton();
        fundoLibra = new javax.swing.JLabel();
        escorpiao = new javax.swing.JPanel();
        areaCaracteristicasEscorpiao = new javax.swing.JPanel();
        tituloCaracteristicaEscorpiao = new javax.swing.JLabel();
        pfortesEscorpiao = new javax.swing.JLabel();
        pMelhorarEscorpiao = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txFortesEscorpiao = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        txMelhorarEscorpiao = new javax.swing.JTextArea();
        areaInformacoesEscorpiao = new javax.swing.JPanel();
        imgSignoEscorpiao = new javax.swing.JLabel();
        tituloEscorpiao = new javax.swing.JLabel();
        periodoEscorpiao = new javax.swing.JLabel();
        elementoEscorpiao = new javax.swing.JLabel();
        planetaEscorpiao = new javax.swing.JLabel();
        corEscorpiao = new javax.swing.JLabel();
        numeroEscorpiao = new javax.swing.JLabel();
        tfPeriodoEscorpiao = new javax.swing.JTextField();
        tfElementoEscorpiao = new javax.swing.JTextField();
        tfPlanetaEscorpiao = new javax.swing.JTextField();
        tfCorEscorpiao = new javax.swing.JTextField();
        tfNumeroEscorpiao = new javax.swing.JTextField();
        areaPrevisaoEscorpiao = new javax.swing.JPanel();
        previsaoEscorpiao = new javax.swing.JLabel();
        txPrevisaoEscorpiao = new javax.swing.JScrollPane();
        txtPrevisaoEscorpiao = new javax.swing.JTextArea();
        btnAtualizarPrevisaoEscorpiao = new javax.swing.JButton();
        areaEnergiaEscorpiao = new javax.swing.JPanel();
        tituloEnergiaEscorpiao = new javax.swing.JLabel();
        trabalhoEscorpiao = new javax.swing.JLabel();
        sorteEscorpiao = new javax.swing.JLabel();
        amorEscorpiao = new javax.swing.JLabel();
        saudeEscorpiao = new javax.swing.JLabel();
        tfAmorEscorpiao = new javax.swing.JTextField();
        tfTrabalhoEscorpiao = new javax.swing.JTextField();
        tfSaudeEscorpiao = new javax.swing.JTextField();
        tfSorteEscorpiao = new javax.swing.JTextField();
        areaMensagemEscorpiao = new javax.swing.JPanel();
        tituloMensagemEscorpiao = new javax.swing.JLabel();
        txMensagemEscorpiao = new javax.swing.JScrollPane();
        txtMensagemEscorpiao = new javax.swing.JTextArea();
        btnCopiarMsgEscorpiao = new javax.swing.JButton();
        fundoEscorpiao = new javax.swing.JLabel();
        sagitario = new javax.swing.JPanel();
        areaCaracteristicasSagitario = new javax.swing.JPanel();
        tituloCaracteristicaSagitario = new javax.swing.JLabel();
        pfortesSagitario = new javax.swing.JLabel();
        pMelhorarSagitario = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        txFortesSagitario = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        txMelhorarSagitario = new javax.swing.JTextArea();
        areaInformacoesSagitario = new javax.swing.JPanel();
        imgSignoSagitario = new javax.swing.JLabel();
        tituloSagitario = new javax.swing.JLabel();
        periodoSagitario = new javax.swing.JLabel();
        elementoSagitario = new javax.swing.JLabel();
        planetaSagitario = new javax.swing.JLabel();
        corSagitario = new javax.swing.JLabel();
        numeroSagitario = new javax.swing.JLabel();
        tfPeriodoSagitario = new javax.swing.JTextField();
        tfElementoSagitario = new javax.swing.JTextField();
        tfPlanetaSagitario = new javax.swing.JTextField();
        tfCorSagitario = new javax.swing.JTextField();
        tfNumeroSagitario = new javax.swing.JTextField();
        areaPrevisaoSagitario = new javax.swing.JPanel();
        previsaoSagitario = new javax.swing.JLabel();
        txPrevisaoSagitario = new javax.swing.JScrollPane();
        txtPrevisaoSagitario = new javax.swing.JTextArea();
        btnAtualizarPrevisaoSagitario = new javax.swing.JButton();
        areaEnergiaSagitario = new javax.swing.JPanel();
        tituloEnergiaSagitario = new javax.swing.JLabel();
        trabalhoSagitario = new javax.swing.JLabel();
        sorteSagitario = new javax.swing.JLabel();
        amorSagitario = new javax.swing.JLabel();
        saudeSagitario = new javax.swing.JLabel();
        tfAmorSagitario = new javax.swing.JTextField();
        tfTrabalhoSagitario = new javax.swing.JTextField();
        tfSaudeSagitario = new javax.swing.JTextField();
        tfSorteSagitario = new javax.swing.JTextField();
        areaMensagemSagitario = new javax.swing.JPanel();
        tituloMensagemSagitario = new javax.swing.JLabel();
        txMensagemSagitario = new javax.swing.JScrollPane();
        txtMensagemSagitario = new javax.swing.JTextArea();
        btnCopiarMsgSagitario = new javax.swing.JButton();
        fundoSagitario = new javax.swing.JLabel();
        capricornio = new javax.swing.JPanel();
        areaCaracteristicasCapricornio = new javax.swing.JPanel();
        tituloCaracteristicaCapricornio = new javax.swing.JLabel();
        pfortesCapricornio = new javax.swing.JLabel();
        pMelhorarCapricornio = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txFortesCapricornio = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        txMelhorarCapricornio = new javax.swing.JTextArea();
        areaInformacoesCapricornio = new javax.swing.JPanel();
        imgSignoCapricornio = new javax.swing.JLabel();
        tituloCapricornio = new javax.swing.JLabel();
        periodoCapricornio = new javax.swing.JLabel();
        elementoCapricornio = new javax.swing.JLabel();
        planetaCapricornio = new javax.swing.JLabel();
        corCapricornio = new javax.swing.JLabel();
        numeroCapricornio = new javax.swing.JLabel();
        tfPeriodoCapricornio = new javax.swing.JTextField();
        tfElementoCapricornio = new javax.swing.JTextField();
        tfPlanetaCapricornio = new javax.swing.JTextField();
        tfCorCapricornio = new javax.swing.JTextField();
        tfNumeroCapricornio = new javax.swing.JTextField();
        areaPrevisaoCapricornio = new javax.swing.JPanel();
        previsaoCapricornio = new javax.swing.JLabel();
        txPrevisaoCapricornio = new javax.swing.JScrollPane();
        txtPrevisaoCapricornio = new javax.swing.JTextArea();
        btnAtualizarPrevisaoCapricornio = new javax.swing.JButton();
        areaCapricornio = new javax.swing.JPanel();
        tituloEnergiaCapricornio = new javax.swing.JLabel();
        trabalhoCapricornio = new javax.swing.JLabel();
        sorteCapricornio = new javax.swing.JLabel();
        amorCapricornio = new javax.swing.JLabel();
        saudeCapricornio = new javax.swing.JLabel();
        tfAmorCapricornio = new javax.swing.JTextField();
        tfTrabalhoCapricornio = new javax.swing.JTextField();
        tfSaudeCapricornio = new javax.swing.JTextField();
        tfSorteCapricornio = new javax.swing.JTextField();
        areaMensagemCapricornio = new javax.swing.JPanel();
        tituloMensagemCapricornio = new javax.swing.JLabel();
        txMensagemCapricornio = new javax.swing.JScrollPane();
        txtMensagemCapricornio = new javax.swing.JTextArea();
        btnCopiarMsgCapricornio = new javax.swing.JButton();
        fundoCapricornio = new javax.swing.JLabel();
        aquario = new javax.swing.JPanel();
        areaCaracteristicasAquario = new javax.swing.JPanel();
        tituloCaracteristicaAquario = new javax.swing.JLabel();
        pfortesAquario = new javax.swing.JLabel();
        pMelhorarAquario = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        txFortesAquario = new javax.swing.JTextArea();
        jScrollPane22 = new javax.swing.JScrollPane();
        txMelhorarAquario = new javax.swing.JTextArea();
        areaInformacoesAquario = new javax.swing.JPanel();
        imgSignoAquario = new javax.swing.JLabel();
        tituloAquario = new javax.swing.JLabel();
        periodoAquario = new javax.swing.JLabel();
        elementoAquario = new javax.swing.JLabel();
        planetaAquario = new javax.swing.JLabel();
        corAquario = new javax.swing.JLabel();
        numeroAquario = new javax.swing.JLabel();
        tfPeriodoAquario = new javax.swing.JTextField();
        tfElementoAquario = new javax.swing.JTextField();
        tfPlanetaAquario = new javax.swing.JTextField();
        tfCorAquario = new javax.swing.JTextField();
        tfNumeroAquario = new javax.swing.JTextField();
        areaPrevisaoAquario = new javax.swing.JPanel();
        previsaoAquario = new javax.swing.JLabel();
        txPrevisaoAries10 = new javax.swing.JScrollPane();
        txtPrevisaoAquario = new javax.swing.JTextArea();
        btnAtualizarPrevisaoAquario = new javax.swing.JButton();
        areaEnergiaAquario = new javax.swing.JPanel();
        tituloEnergiaAquario = new javax.swing.JLabel();
        trabalhoAquario = new javax.swing.JLabel();
        sorteAquario = new javax.swing.JLabel();
        amorAquario = new javax.swing.JLabel();
        saudeAquario = new javax.swing.JLabel();
        tfAmorAquario = new javax.swing.JTextField();
        tfTrabalhoAquario = new javax.swing.JTextField();
        tfSaudeAquario = new javax.swing.JTextField();
        tfSorteAquario = new javax.swing.JTextField();
        areaMensagemAquario = new javax.swing.JPanel();
        tituloMensagemAquario = new javax.swing.JLabel();
        txMensagemAquario = new javax.swing.JScrollPane();
        txtMensagemAquario = new javax.swing.JTextArea();
        btnCopiarMsgAquario = new javax.swing.JButton();
        fundoAquario = new javax.swing.JLabel();
        peixes = new javax.swing.JPanel();
        areaCaracteristicasPeixes = new javax.swing.JPanel();
        tituloCaracteristicaPeixes = new javax.swing.JLabel();
        pfortesPeixes = new javax.swing.JLabel();
        pMelhorarPeixes = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txFortesPeixes = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        txMelhorarPeixes = new javax.swing.JTextArea();
        areaInformacoesPeixes = new javax.swing.JPanel();
        imgSignoPeixes = new javax.swing.JLabel();
        tituloPeixes = new javax.swing.JLabel();
        periodoPeixes = new javax.swing.JLabel();
        elementoPeixes = new javax.swing.JLabel();
        planetaPeixes = new javax.swing.JLabel();
        corPeixes = new javax.swing.JLabel();
        numeroPeixes = new javax.swing.JLabel();
        tfPeriodoPeixes = new javax.swing.JTextField();
        tfElementoPeixes = new javax.swing.JTextField();
        tfPlanetaPeixes = new javax.swing.JTextField();
        tfCorPeixes = new javax.swing.JTextField();
        tfNumeroPeixes = new javax.swing.JTextField();
        areaPrevisaoPeixes = new javax.swing.JPanel();
        previsaoPeixes = new javax.swing.JLabel();
        txPrevisaoPeixes = new javax.swing.JScrollPane();
        txtPrevisaoPeixes = new javax.swing.JTextArea();
        btnAtualizarPrevisaoPeixes = new javax.swing.JButton();
        areaEnergiaPeixes = new javax.swing.JPanel();
        tituloEnergiaPeixes = new javax.swing.JLabel();
        trabalhoPeixes = new javax.swing.JLabel();
        sortePeixes = new javax.swing.JLabel();
        amorPeixes = new javax.swing.JLabel();
        saudePeixes = new javax.swing.JLabel();
        tfAmorPeixes = new javax.swing.JTextField();
        tfTrabalhoPeixes = new javax.swing.JTextField();
        tfSaudePeixes = new javax.swing.JTextField();
        tfSortePeixes = new javax.swing.JTextField();
        areaMensagemPeixes = new javax.swing.JPanel();
        tituloMensagemPeixes = new javax.swing.JLabel();
        txMensagemPeixes = new javax.swing.JScrollPane();
        txtMensagemPeixes = new javax.swing.JTextArea();
        btnCopiarMsgPeixes = new javax.swing.JButton();
        fundoPeixes = new javax.swing.JLabel();
        fundoAries1 = new javax.swing.JLabel();
        fundoAries2 = new javax.swing.JLabel();
        fundoAries3 = new javax.swing.JLabel();
        fundoAries4 = new javax.swing.JLabel();
        fundoAries5 = new javax.swing.JLabel();
        fundoAries6 = new javax.swing.JLabel();
        fundoAries7 = new javax.swing.JLabel();
        fundoAries8 = new javax.swing.JLabel();
        fundoAries9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        areaAbas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Descubra Seu Signo");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("Dia de Nascimento:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("Mês de Nascimento:");

        tfNome.setText("digite seu nome");

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDia.addActionListener(this::cbDiaActionPerformed);

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        btnDescobrirSigno.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnDescobrirSigno.setText("Descobrir Signo");
        btnDescobrirSigno.addActionListener(this::btnDescobrirSignoActionPerformed);

        javax.swing.GroupLayout areaDescobrirSignoLayout = new javax.swing.GroupLayout(areaDescobrirSigno);
        areaDescobrirSigno.setLayout(areaDescobrirSignoLayout);
        areaDescobrirSignoLayout.setHorizontalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnDescobrirSigno))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        areaDescobrirSignoLayout.setVerticalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDescobrirSigno)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        inicio.add(areaDescobrirSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 270, 210));

        tituloCompatibilidade.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tituloCompatibilidade.setText("Compatibilidade");

        signo1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        signo1.setText("Primeiro Signo");

        signo2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        signo2.setText("Segundo Signo");

        cbSigno1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        cbSigno2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        btnCalcular.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCalcular.setText("Calcular ");
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);

        javax.swing.GroupLayout areaComopatibilidadeLayout = new javax.swing.GroupLayout(areaComopatibilidade);
        areaComopatibilidade.setLayout(areaComopatibilidadeLayout);
        areaComopatibilidadeLayout.setHorizontalGroup(
            areaComopatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaComopatibilidadeLayout.createSequentialGroup()
                .addGroup(areaComopatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaComopatibilidadeLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(tituloCompatibilidade))
                    .addGroup(areaComopatibilidadeLayout.createSequentialGroup()
                        .addGroup(areaComopatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaComopatibilidadeLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(signo1)
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(areaComopatibilidadeLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(signo2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGroup(areaComopatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(areaComopatibilidadeLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaComopatibilidadeLayout.setVerticalGroup(
            areaComopatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaComopatibilidadeLayout.createSequentialGroup()
                .addComponent(tituloCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaComopatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo1)
                    .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaComopatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo2)
                    .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        inicio.add(areaComopatibilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 250, 170));

        signo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        signo.setText("Signo");

        Compatibilidade.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Compatibilidade.setText("Compatibilidade");

        btnSigno.setText("jButton1");

        tfCompatibilidade.setText("jTextField1");

        btnPlay.setText("Play");
        btnPlay.addActionListener(this::btnPlayActionPerformed);

        btnPause.setText("Pause");
        btnPause.addActionListener(this::btnPauseActionPerformed);

        javax.swing.GroupLayout areaResultadoLayout = new javax.swing.GroupLayout(areaResultado);
        areaResultado.setLayout(areaResultadoLayout);
        areaResultadoLayout.setHorizontalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(signo))
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaResultadoLayout.createSequentialGroup()
                                .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Compatibilidade))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        areaResultadoLayout.setVerticalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(signo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Compatibilidade)
                .addGap(30, 30, 30)
                .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        inicio.add(areaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 400, 680));

        fundoInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        inicio.add(fundoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 790));

        areaAbas.addTab("Inicio", inicio);

        aries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaAries.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaAries.setText("Características");

        pfortesAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesAries.setText("Pontos Fortes:");

        pMelhorarAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarAries.setText("Pontos a Melhorar:");

        txFortesAries.setColumns(20);
        txFortesAries.setRows(5);
        txFortesAries.setText("Coragem, iniciativa, determinação e energia para enfrentar desafios.");
        jScrollPane1.setViewportView(txFortesAries);

        txMelhorarAries.setColumns(20);
        txMelhorarAries.setRows(5);
        txMelhorarAries.setText("Impulsividade, ansiedade e dificuldade em ouvir opiniões diferentes.");
        jScrollPane2.setViewportView(txMelhorarAries);

        javax.swing.GroupLayout areaCaracteristicasAriesLayout = new javax.swing.GroupLayout(areaCaracteristicasAries);
        areaCaracteristicasAries.setLayout(areaCaracteristicasAriesLayout);
        areaCaracteristicasAriesLayout.setHorizontalGroup(
            areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaAries, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(pMelhorarAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasAriesLayout.setVerticalGroup(
            areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaAries, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addGap(27, 27, 27))
        );

        aries.add(areaCaracteristicasAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Aries.png")); // NOI18N

        tituloAries.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloAries.setText("ÁRIES");

        periodoAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoAries.setText("PERIODO:");

        elementoAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoAries.setText("ELEMENTO:");

        planetaAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaAries.setText("PLANETA REGENTE:");

        corAries.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corAries.setText("COR:");

        numeroAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroAries.setText("NÚMERO DA SORTE:");

        tfPeriodoAries.setText("21/03 a 19/04");

        tfElementoAries.setText("Fogo");

        tfPlanetaAries.setText("Marte");

        tfCorAries.setText("Vermelho");

        tfNumeroAries.setText("9");

        javax.swing.GroupLayout areaInformacoesAriesLayout = new javax.swing.GroupLayout(areaInformacoesAries);
        areaInformacoesAries.setLayout(areaInformacoesAriesLayout);
        areaInformacoesAriesLayout.setHorizontalGroup(
            areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                            .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroAries, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaAries)
                                .addComponent(tfNumeroAries)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAriesLayout.createSequentialGroup()
                            .addComponent(elementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoAries))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAriesLayout.createSequentialGroup()
                            .addComponent(periodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                            .addComponent(corAries, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorAries))))
                .addGap(10, 10, 10))
        );
        areaInformacoesAriesLayout.setVerticalGroup(
            areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloAries, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAries)
                    .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAries)
                    .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAries)
                    .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAries)
                    .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAries)
                    .addComponent(tfNumeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        aries.add(areaInformacoesAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoAries.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoAries.setText("Previsão do Dia:");

        txtPrevisaoAries.setColumns(20);
        txtPrevisaoAries.setRows(5);
        txtPrevisaoAries.setText("Um dia favorável para tomar iniciativas e resolver assuntos que estavam pendentes. No trabalho, sua determinação pode trazer bons resultados. No amor, evite agir por impulso e procure ouvir mais.");
        txPrevisaoAries.setViewportView(txtPrevisaoAries);

        btnAtualizarPrevisaoAries.setBackground(new java.awt.Color(51, 102, 255));
        btnAtualizarPrevisaoAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoAries.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoAries.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoAriesLayout = new javax.swing.GroupLayout(areaPrevisaoAries);
        areaPrevisaoAries.setLayout(areaPrevisaoAriesLayout);
        areaPrevisaoAriesLayout.setHorizontalGroup(
            areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries)
                    .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoAriesLayout.setVerticalGroup(
            areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        aries.add(areaPrevisaoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaAries.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaAries.setText("Energia do Dia");

        trabalhoAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoAries.setText("Trabalho:");

        sorteAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteAries.setText("Sorte:");

        amorAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorAries.setText("Amor:");

        saudeAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeAries.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaAriesLayout = new javax.swing.GroupLayout(areaEnergiaAries);
        areaEnergiaAries.setLayout(areaEnergiaAriesLayout);
        areaEnergiaAriesLayout.setHorizontalGroup(
            areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                        .addComponent(amorAries, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorAries)
                    .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                        .addComponent(trabalhoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoAries)
                    .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                        .addComponent(saudeAries, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeAries)
                    .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                        .addComponent(sorteAries, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteAries)
                    .addComponent(tituloEnergiaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaAriesLayout.setVerticalGroup(
            areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries)
                .addGap(16, 16, 16)
                .addComponent(trabalhoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeAries)
                .addGap(15, 15, 15)
                .addComponent(sorteAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAries)
                .addGap(51, 51, 51))
        );

        aries.add(areaEnergiaAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemAries.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemAries.setText("Mensagem do dia");

        txtMensagemAries.setColumns(20);
        txtMensagemAries.setRows(5);
        txtMensagemAries.setText("Acredite na sua capacidade de começar algo novo, mas lembre-se de pensar antes de agir.");
        txMensagemAries.setViewportView(txtMensagemAries);

        btnCopiarMsgAries.setBackground(new java.awt.Color(51, 51, 255));
        btnCopiarMsgAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgAries.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgAries.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemAriesLayout = new javax.swing.GroupLayout(areaMensagemAries);
        areaMensagemAries.setLayout(areaMensagemAriesLayout);
        areaMensagemAriesLayout.setHorizontalGroup(
            areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgAries, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemAriesLayout.setVerticalGroup(
            areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgAries)
                .addGap(20, 20, 20))
        );

        aries.add(areaMensagemAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoAries.setText("jLabel1");
        aries.add(fundoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Áries", aries);

        touro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaTouro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaTouro.setText("Características");

        pfortesTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesTouro.setText("Pontos Fortes:");

        pMelhorarTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarTouro.setText("Pontos a Melhorar:");

        txFortesTouro.setColumns(20);
        txFortesTouro.setRows(5);
        txFortesTouro.setText("Paciência, lealdade, responsabilidade e determinação.");
        jScrollPane3.setViewportView(txFortesTouro);

        txMelhorarTouro.setColumns(20);
        txMelhorarTouro.setRows(5);
        txMelhorarTouro.setText("Teimosia, resistência a mudanças e apego ao passado.");
        jScrollPane4.setViewportView(txMelhorarTouro);

        javax.swing.GroupLayout areaCaracteristicasTouroLayout = new javax.swing.GroupLayout(areaCaracteristicasTouro);
        areaCaracteristicasTouro.setLayout(areaCaracteristicasTouroLayout);
        areaCaracteristicasTouroLayout.setHorizontalGroup(
            areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(pMelhorarTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasTouroLayout.setVerticalGroup(
            areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4)
                .addGap(27, 27, 27))
        );

        touro.add(areaCaracteristicasTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Touro.png")); // NOI18N

        tituloTouro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloTouro.setText("Touro");

        periodoTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoTouro.setText("PERIODO:");

        elementoTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoTouro.setText("ELEMENTO:");

        planetaTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaTouro.setText("PLANETA REGENTE:");

        corTouro.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corTouro.setText("COR:");

        numeroTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroTouro.setText("NÚMERO DA SORTE:");

        tfPeriodoTouro.setText("20/04 a 20/05");

        tfElementoTouro.setText("Terra");

        tfPlanetaTouro.setText("Venus");

        tfCorTouro.setText("Verde");

        tfNumeroTouro.setText("6");

        javax.swing.GroupLayout areaInformacoesTouroLayout = new javax.swing.GroupLayout(areaInformacoesTouro);
        areaInformacoesTouro.setLayout(areaInformacoesTouroLayout);
        areaInformacoesTouroLayout.setHorizontalGroup(
            areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                            .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaTouro)
                                .addComponent(tfNumeroTouro)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesTouroLayout.createSequentialGroup()
                            .addComponent(elementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoTouro))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesTouroLayout.createSequentialGroup()
                            .addComponent(periodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                            .addComponent(corTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorTouro))))
                .addGap(10, 10, 10))
        );
        areaInformacoesTouroLayout.setVerticalGroup(
            areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoTouro)
                    .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoTouro)
                    .addComponent(tfElementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaTouro)
                    .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corTouro)
                    .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroTouro)
                    .addComponent(tfNumeroTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        touro.add(areaInformacoesTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoTouro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoTouro.setText("Previsão do Dia:");

        txtPrevisaoTouro.setColumns(20);
        txtPrevisaoTouro.setRows(5);
        txtPrevisaoTouro.setText("Hoje é um bom momento para manter a calma e organizar seus planos. No trabalho, sua dedicação será reconhecida. No amor, uma conversa sincera pode aproximar você de alguém especial.");
        txPrevisaoTouro.setViewportView(txtPrevisaoTouro);

        btnAtualizarPrevisaoTouro.setBackground(new java.awt.Color(51, 51, 255));
        btnAtualizarPrevisaoTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoTouro.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoTouroLayout = new javax.swing.GroupLayout(areaPrevisaoTouro);
        areaPrevisaoTouro.setLayout(areaPrevisaoTouroLayout);
        areaPrevisaoTouroLayout.setHorizontalGroup(
            areaPrevisaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoTouro)
                    .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoTouroLayout.setVerticalGroup(
            areaPrevisaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        touro.add(areaPrevisaoTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaTouro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaTouro.setText("Energia do Dia");

        trabalhoTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoTouro.setText("Trabalho:");

        sorteTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteTouro.setText("Sorte:");

        amorTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorTouro.setText("Amor:");

        saudeTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeTouro.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaTouroLayout = new javax.swing.GroupLayout(areaEnergiaTouro);
        areaEnergiaTouro.setLayout(areaEnergiaTouroLayout);
        areaEnergiaTouroLayout.setHorizontalGroup(
            areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                        .addComponent(amorTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorTouro)
                    .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                        .addComponent(trabalhoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoTouro)
                    .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                        .addComponent(saudeTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeTouro)
                    .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                        .addComponent(sorteTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteTouro)
                    .addComponent(tituloEnergiaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaTouroLayout.setVerticalGroup(
            areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorTouro)
                .addGap(16, 16, 16)
                .addComponent(trabalhoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeTouro)
                .addGap(15, 15, 15)
                .addComponent(sorteTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteTouro)
                .addGap(51, 51, 51))
        );

        touro.add(areaEnergiaTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemTouro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemTouro.setText("Mensagem do dia");

        txtMensagemTouro.setColumns(20);
        txtMensagemTouro.setRows(5);
        txtMensagemTouro.setText("Grandes resultados são construídos com paciência e constância.");
        txMensagemTouro.setViewportView(txtMensagemTouro);

        btnCopiarMsgTouro.setBackground(new java.awt.Color(51, 51, 255));
        btnCopiarMsgTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgTouro.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemTouroLayout = new javax.swing.GroupLayout(areaMensagemTouro);
        areaMensagemTouro.setLayout(areaMensagemTouroLayout);
        areaMensagemTouroLayout.setHorizontalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemTouroLayout.setVerticalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgTouro)
                .addGap(20, 20, 20))
        );

        touro.add(areaMensagemTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoTouro.setText("jLabel1");
        touro.add(fundoTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        areaAbas.addTab("Touro", touro);

        gemeos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaGemeos.setText("Características");

        pfortesGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesGemeos.setText("Pontos Fortes:");

        pMelhorarGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarGemeos.setText("Pontos a Melhorar:");

        txFortesGemeos.setColumns(20);
        txFortesGemeos.setRows(5);
        txFortesGemeos.setText("Comunicação, criatividade, inteligência e facilidade para aprender.");
        jScrollPane5.setViewportView(txFortesGemeos);

        txMelhorarGemeos.setColumns(20);
        txMelhorarGemeos.setRows(5);
        txMelhorarGemeos.setText("Inquietação, indecisão e falta de concentração.");
        jScrollPane6.setViewportView(txMelhorarGemeos);

        javax.swing.GroupLayout areaCaracteristicasGemeosLayout = new javax.swing.GroupLayout(areaCaracteristicasGemeos);
        areaCaracteristicasGemeos.setLayout(areaCaracteristicasGemeosLayout);
        areaCaracteristicasGemeosLayout.setHorizontalGroup(
            areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addComponent(pMelhorarGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasGemeosLayout.setVerticalGroup(
            areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6)
                .addGap(27, 27, 27))
        );

        gemeos.add(areaCaracteristicasGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Gemeos.png")); // NOI18N

        tituloGemeos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloGemeos.setText("Gêmeos");

        periodoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoGemeos.setText("PERIODO:");

        elementoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoGemeos.setText("ELEMENTO:");

        planetaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaGemeos.setText("PLANETA REGENTE:");

        corGemeos.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corGemeos.setText("COR:");

        numeroGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroGemeos.setText("NÚMERO DA SORTE:");

        tfPeriodoGemeos.setText("21/05 a 20/06");

        tfElementoGemeos.setText("Ar");

        tfPlanetaGemeos.setText("Mercurio");

        tfCorGemeos.setText("Amarelo");

        tfNumeroGemeos.setText("5");

        javax.swing.GroupLayout areaInformacoesGemeosLayout = new javax.swing.GroupLayout(areaInformacoesGemeos);
        areaInformacoesGemeos.setLayout(areaInformacoesGemeosLayout);
        areaInformacoesGemeosLayout.setHorizontalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                            .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaGemeos)
                                .addComponent(tfNumeroGemeos)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesGemeosLayout.createSequentialGroup()
                            .addComponent(elementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoGemeos))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesGemeosLayout.createSequentialGroup()
                            .addComponent(periodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                            .addComponent(corGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorGemeos))))
                .addGap(10, 10, 10))
        );
        areaInformacoesGemeosLayout.setVerticalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoGemeos)
                    .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoGemeos)
                    .addComponent(tfElementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaGemeos)
                    .addComponent(tfPlanetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corGemeos)
                    .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroGemeos)
                    .addComponent(tfNumeroGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        gemeos.add(areaInformacoesGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoGemeos.setText("Previsão do Dia:");

        txtPrevisaoGemeos.setColumns(20);
        txtPrevisaoGemeos.setRows(5);
        txtPrevisaoGemeos.setText("Sua comunicação estará em destaque. Aproveite para apresentar ideias e conversar sobre novos projetos. No amor, uma boa conversa poderá esclarecer sentimentos.");
        txPrevisaoGemeos.setViewportView(txtPrevisaoGemeos);

        btnAtualizarPrevisaoGemeos.setBackground(new java.awt.Color(51, 51, 255));
        btnAtualizarPrevisaoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoGemeos.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoGemeosLayout = new javax.swing.GroupLayout(areaPrevisaoGemeos);
        areaPrevisaoGemeos.setLayout(areaPrevisaoGemeosLayout);
        areaPrevisaoGemeosLayout.setHorizontalGroup(
            areaPrevisaoGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoGemeos)
                    .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoGemeosLayout.setVerticalGroup(
            areaPrevisaoGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        gemeos.add(areaPrevisaoGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaGemeos.setText("Energia do Dia");

        trabalhoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoGemeos.setText("Trabalho:");

        sorteGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteGemeos.setText("Sorte:");

        amorGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorGemeos.setText("Amor:");

        saudeGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeGemeos.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaGemeosLayout = new javax.swing.GroupLayout(areaEnergiaGemeos);
        areaEnergiaGemeos.setLayout(areaEnergiaGemeosLayout);
        areaEnergiaGemeosLayout.setHorizontalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                        .addComponent(amorGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorGemeos)
                    .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                        .addComponent(trabalhoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoGemeos)
                    .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                        .addComponent(saudeGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeGemeos)
                    .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                        .addComponent(sorteGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteGemeos)
                    .addComponent(tituloEnergiaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaGemeosLayout.setVerticalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorGemeos)
                .addGap(16, 16, 16)
                .addComponent(trabalhoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeGemeos)
                .addGap(15, 15, 15)
                .addComponent(sorteGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteGemeos)
                .addGap(51, 51, 51))
        );

        gemeos.add(areaEnergiaGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemGemeos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemGemeos.setText("Mensagem do dia");

        txtMensagemGemeos.setColumns(20);
        txtMensagemGemeos.setRows(5);
        txtMensagemGemeos.setText("Use suas palavras para criar oportunidades e aproximar pessoas.");
        txMensagemGemeos.setViewportView(txtMensagemGemeos);

        btnCopiarMsgGemeos.setBackground(new java.awt.Color(51, 51, 255));
        btnCopiarMsgGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgGemeos.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgGemeos.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemGemeosLayout = new javax.swing.GroupLayout(areaMensagemGemeos);
        areaMensagemGemeos.setLayout(areaMensagemGemeosLayout);
        areaMensagemGemeosLayout.setHorizontalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemGemeosLayout.setVerticalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgGemeos)
                .addGap(20, 20, 20))
        );

        gemeos.add(areaMensagemGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoGemeos.setText("jLabel1");
        gemeos.add(fundoGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Gêmeos", gemeos);

        cancer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaCancer.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaCancer.setText("Características");

        pfortesCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesCancer.setText("Pontos Fortes:");

        pMelhorarCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarCancer.setText("Pontos a Melhorar:");

        txFortesCancer.setColumns(20);
        txFortesCancer.setRows(5);
        txFortesCancer.setText("Sensibilidade, empatia, proteção e criatividade.");
        jScrollPane7.setViewportView(txFortesCancer);

        txMelhorarCancer.setColumns(20);
        txMelhorarCancer.setRows(5);
        txMelhorarCancer.setText("Insegurança, preocupação excessiva e dificuldade em deixar o passado para trás.");
        jScrollPane8.setViewportView(txMelhorarCancer);

        javax.swing.GroupLayout areaCaracteristicasCancerLayout = new javax.swing.GroupLayout(areaCaracteristicasCancer);
        areaCaracteristicasCancer.setLayout(areaCaracteristicasCancerLayout);
        areaCaracteristicasCancerLayout.setHorizontalGroup(
            areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7)
                    .addComponent(pMelhorarCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasCancerLayout.setVerticalGroup(
            areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8)
                .addGap(27, 27, 27))
        );

        cancer.add(areaCaracteristicasCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Cancer.png")); // NOI18N

        tituloCancer.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloCancer.setText("Câncer");

        periodoCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoCancer.setText("PERIODO:");

        elementoCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoCancer.setText("ELEMENTO:");

        planetaCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaCancer.setText("PLANETA REGENTE:");

        corCancer.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corCancer.setText("COR:");

        numeroCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroCancer.setText("NÚMERO DA SORTE:");

        tfPeriodoCancer.setText("21/06 a 22/07");

        tfElementoCancer.setText("Água");

        tfPlanetaCancer.setText("Lua");

        tfCorCancer.setText("Prata");

        tfNumeroCancer.setText("2");

        javax.swing.GroupLayout areaInformacoesCancerLayout = new javax.swing.GroupLayout(areaInformacoesCancer);
        areaInformacoesCancer.setLayout(areaInformacoesCancerLayout);
        areaInformacoesCancerLayout.setHorizontalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                            .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaCancer)
                                .addComponent(tfNumeroCancer)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCancerLayout.createSequentialGroup()
                            .addComponent(elementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoCancer))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCancerLayout.createSequentialGroup()
                            .addComponent(periodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                            .addComponent(corCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorCancer))))
                .addGap(10, 10, 10))
        );
        areaInformacoesCancerLayout.setVerticalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoCancer)
                    .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoCancer)
                    .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCancer)
                    .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCancer)
                    .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCancer)
                    .addComponent(tfNumeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        cancer.add(areaInformacoesCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoCancer.setText("Previsão do Dia:");

        txtPrevisaoCancer.setColumns(20);
        txtPrevisaoCancer.setRows(5);
        txtPrevisaoCancer.setText("O dia favorece momentos de proximidade com pessoas importantes. No trabalho, evite carregar responsabilidades que não são suas. Cuide também do seu descanso.");
        txPrevisaoCancer.setViewportView(txtPrevisaoCancer);

        btnAtualizarPrevisaoCancer.setBackground(new java.awt.Color(51, 51, 255));
        btnAtualizarPrevisaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoCancer.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoCancerLayout = new javax.swing.GroupLayout(areaPrevisaoCancer);
        areaPrevisaoCancer.setLayout(areaPrevisaoCancerLayout);
        areaPrevisaoCancerLayout.setHorizontalGroup(
            areaPrevisaoCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoCancer)
                    .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoCancerLayout.setVerticalGroup(
            areaPrevisaoCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        cancer.add(areaPrevisaoCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaCancer.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaCancer.setText("Energia do Dia");

        trabalhoCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoCancer.setText("Trabalho:");

        sorteCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteCancer.setText("Sorte:");

        amorCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorCancer.setText("Amor:");

        saudeCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeCancer.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaCancerLayout = new javax.swing.GroupLayout(areaEnergiaCancer);
        areaEnergiaCancer.setLayout(areaEnergiaCancerLayout);
        areaEnergiaCancerLayout.setHorizontalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                        .addComponent(amorCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorCancer)
                    .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                        .addComponent(trabalhoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoCancer)
                    .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                        .addComponent(saudeCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeCancer)
                    .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                        .addComponent(sorteCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteCancer)
                    .addComponent(tituloEnergiaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaCancerLayout.setVerticalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCancer)
                .addGap(16, 16, 16)
                .addComponent(trabalhoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeCancer)
                .addGap(15, 15, 15)
                .addComponent(sorteCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteCancer)
                .addGap(51, 51, 51))
        );

        cancer.add(areaEnergiaCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemCancer.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemCancer.setText("Mensagem do dia");

        btnCopiarMsgCancer.setBackground(new java.awt.Color(51, 51, 255));
        btnCopiarMsgCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgCancer.setText("Copiar Mensagem");

        txtMensagemCancer.setColumns(20);
        txtMensagemCancer.setRows(5);
        txtMensagemCancer.setText("Valorize quem está ao seu lado, mas não se esqueça de valorizar você também.");

        javax.swing.GroupLayout areaMensagemCancerLayout = new javax.swing.GroupLayout(areaMensagemCancer);
        areaMensagemCancer.setLayout(areaMensagemCancerLayout);
        areaMensagemCancerLayout.setHorizontalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        areaMensagemCancerLayout.setVerticalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgCancer)
                .addGap(20, 20, 20))
            .addGroup(areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        cancer.add(areaMensagemCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoCancer.setText("jLabel1");
        cancer.add(fundoCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Câncer", cancer);

        leao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaLeao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaLeao.setText("Características");

        pfortesLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesLeao.setText("Pontos Fortes:");

        pMelhorarLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarLeao.setText("Pontos a Melhorar:");

        txFortesLeao.setColumns(20);
        txFortesLeao.setRows(5);
        txFortesLeao.setText("Liderança, confiança, criatividade e generosidade.");
        jScrollPane9.setViewportView(txFortesLeao);

        txMelhorarLeao.setColumns(20);
        txMelhorarLeao.setRows(5);
        txMelhorarLeao.setText("Orgulho, impaciência e necessidade de reconhecimento.");
        jScrollPane10.setViewportView(txMelhorarLeao);

        javax.swing.GroupLayout areaCaracteristicasLeaoLayout = new javax.swing.GroupLayout(areaCaracteristicasLeao);
        areaCaracteristicasLeao.setLayout(areaCaracteristicasLeaoLayout);
        areaCaracteristicasLeaoLayout.setHorizontalGroup(
            areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9)
                    .addComponent(pMelhorarLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane10))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasLeaoLayout.setVerticalGroup(
            areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10)
                .addGap(27, 27, 27))
        );

        leao.add(areaCaracteristicasLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Leao.png")); // NOI18N

        tituloLeao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloLeao.setText("Leão");

        periodoLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoLeao.setText("PERIODO:");

        elementoLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoLeao.setText("ELEMENTO:");

        planetaLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaLeao.setText("PLANETA REGENTE:");

        corLeao.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corLeao.setText("COR:");

        numeroLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroLeao.setText("NÚMERO DA SORTE:");

        tfPeriodoLeao.setText("23/07 a 22/08");

        tfElementoLeao.setText("Fogo");

        tfPlanetaLeao.setText("Sol");

        tfCorLeao.setText("Dourado");

        tfNumeroLeao.setText("1");

        javax.swing.GroupLayout areaInformacoesLeaoLayout = new javax.swing.GroupLayout(areaInformacoesLeao);
        areaInformacoesLeao.setLayout(areaInformacoesLeaoLayout);
        areaInformacoesLeaoLayout.setHorizontalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                            .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaLeao)
                                .addComponent(tfNumeroLeao)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLeaoLayout.createSequentialGroup()
                            .addComponent(elementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoLeao))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLeaoLayout.createSequentialGroup()
                            .addComponent(periodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                            .addComponent(corLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorLeao))))
                .addGap(10, 10, 10))
        );
        areaInformacoesLeaoLayout.setVerticalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoLeao)
                    .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLeao)
                    .addComponent(tfElementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLeao)
                    .addComponent(tfPlanetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLeao)
                    .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLeao)
                    .addComponent(tfNumeroLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        leao.add(areaInformacoesLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoLeao.setText("Previsão do Dia:");

        txtPrevisaoLeao.setColumns(20);
        txtPrevisaoLeao.setRows(5);
        txtPrevisaoLeao.setText("Seu brilho pessoal estará em alta. Aproveite para mostrar suas habilidades e assumir novos desafios. No amor, demonstre seus sentimentos sem deixar o orgulho atrapalhar.");
        txPrevisaoAries4.setViewportView(txtPrevisaoLeao);

        btnAtualizarPrevisaoLeao.setBackground(new java.awt.Color(51, 51, 255));
        btnAtualizarPrevisaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoLeao.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoLeaoLayout = new javax.swing.GroupLayout(areaPrevisaoLeao);
        areaPrevisaoLeao.setLayout(areaPrevisaoLeaoLayout);
        areaPrevisaoLeaoLayout.setHorizontalGroup(
            areaPrevisaoLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries4)
                    .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoLeaoLayout.setVerticalGroup(
            areaPrevisaoLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries4, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        leao.add(areaPrevisaoLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaLeao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaLeao.setText("Energia do Dia");

        trabalhoLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoLeao.setText("Trabalho:");

        sorteLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteLeao.setText("Sorte:");

        amorLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorLeao.setText("Amor:");

        saudeLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeLeao.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaLeaoLayout = new javax.swing.GroupLayout(areaEnergiaLeao);
        areaEnergiaLeao.setLayout(areaEnergiaLeaoLayout);
        areaEnergiaLeaoLayout.setHorizontalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                        .addComponent(amorLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorLeao)
                    .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                        .addComponent(trabalhoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoLeao)
                    .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                        .addComponent(saudeLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeLeao)
                    .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                        .addComponent(sorteLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteLeao)
                    .addComponent(tituloEnergiaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaLeaoLayout.setVerticalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLeao)
                .addGap(16, 16, 16)
                .addComponent(trabalhoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeLeao)
                .addGap(15, 15, 15)
                .addComponent(sorteLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteLeao)
                .addGap(51, 51, 51))
        );

        leao.add(areaEnergiaLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemLeao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemLeao.setText("Mensagem do dia");

        txtMensagemLeao.setColumns(20);
        txtMensagemLeao.setRows(5);
        txtMensagemLeao.setText("Confiança abre portas, mas humildade ajuda a mantê-las abertas.");
        txMensagemLeao.setViewportView(txtMensagemLeao);

        btnCopiarMsgLeao.setBackground(new java.awt.Color(51, 51, 255));
        btnCopiarMsgLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgLeao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLeaoLayout = new javax.swing.GroupLayout(areaMensagemLeao);
        areaMensagemLeao.setLayout(areaMensagemLeaoLayout);
        areaMensagemLeaoLayout.setHorizontalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemLeaoLayout.setVerticalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgLeao)
                .addGap(20, 20, 20))
        );

        leao.add(areaMensagemLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoLeao.setText("jLabel1");
        leao.add(fundoLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Leão", leao);

        virgem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaVirgem.setText("Características");

        pfortesVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesVirgem.setText("Pontos Fortes:");

        pMelhorarVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarVirgem.setText("Pontos a Melhorar:");

        txFortesVirgem.setColumns(20);
        txFortesVirgem.setRows(5);
        txFortesVirgem.setText("Organização, inteligência, responsabilidade e atenção aos detalhes.");
        jScrollPane11.setViewportView(txFortesVirgem);

        txMelhorarVirgem.setColumns(20);
        txMelhorarVirgem.setRows(5);
        txMelhorarVirgem.setText("Perfeccionismo, preocupação excessiva e autocrítica.");
        jScrollPane12.setViewportView(txMelhorarVirgem);

        javax.swing.GroupLayout areaCaracteristicasVirgemLayout = new javax.swing.GroupLayout(areaCaracteristicasVirgem);
        areaCaracteristicasVirgem.setLayout(areaCaracteristicasVirgemLayout);
        areaCaracteristicasVirgemLayout.setHorizontalGroup(
            areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane11)
                    .addComponent(pMelhorarVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane12))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasVirgemLayout.setVerticalGroup(
            areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12)
                .addGap(27, 27, 27))
        );

        virgem.add(areaCaracteristicasVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Virgem.png")); // NOI18N

        tituloVirgem.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloVirgem.setText("Virgem");

        periodoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoVirgem.setText("PERIODO:");

        elementoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoVirgem.setText("ELEMENTO:");

        planetaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaVirgem.setText("PLANETA REGENTE:");

        corVirgem.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corVirgem.setText("COR:");

        numeroVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroVirgem.setText("NÚMERO DA SORTE:");

        tfPeriodoVirgem.setText("23/08 a 22/09");

        tfElementoVirgem.setText("Terra");

        tfPlanetaVirgem.setText("Mercurio");

        tfCorVirgem.setText("Azul-Marinho");

        tfNumeroVirgem.setText("4");

        javax.swing.GroupLayout areaInformacoesVirgemLayout = new javax.swing.GroupLayout(areaInformacoesVirgem);
        areaInformacoesVirgem.setLayout(areaInformacoesVirgemLayout);
        areaInformacoesVirgemLayout.setHorizontalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                            .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaVirgem)
                                .addComponent(tfNumeroVirgem)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesVirgemLayout.createSequentialGroup()
                            .addComponent(elementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoVirgem))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesVirgemLayout.createSequentialGroup()
                            .addComponent(periodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                            .addComponent(corVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorVirgem))))
                .addGap(10, 10, 10))
        );
        areaInformacoesVirgemLayout.setVerticalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoVirgem)
                    .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoVirgem)
                    .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaVirgem)
                    .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corVirgem)
                    .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroVirgem)
                    .addComponent(tfNumeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        virgem.add(areaInformacoesVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoVirgem.setText("Previsão do Dia:");

        txtPrevisaoVirgem.setColumns(20);
        txtPrevisaoVirgem.setRows(5);
        txtPrevisaoVirgem.setText("Organização será sua maior aliada. No trabalho, pequenos detalhes podem fazer uma grande diferença. No amor, tente não analisar demais cada situação.");
        txPrevisaoVirgem.setViewportView(txtPrevisaoVirgem);

        btnAtualizarPrevisaoVirgem.setBackground(new java.awt.Color(51, 51, 255));
        btnAtualizarPrevisaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoVirgem.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoVirgemLayout = new javax.swing.GroupLayout(areaPrevisaoVirgem);
        areaPrevisaoVirgem.setLayout(areaPrevisaoVirgemLayout);
        areaPrevisaoVirgemLayout.setHorizontalGroup(
            areaPrevisaoVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoVirgem)
                    .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoVirgemLayout.setVerticalGroup(
            areaPrevisaoVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        virgem.add(areaPrevisaoVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaVirgem.setText("Energia do Dia");

        trabalhoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoVirgem.setText("Trabalho:");

        sorteVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteVirgem.setText("Sorte:");

        amorVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorVirgem.setText("Amor:");

        saudeVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeVirgem.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaVirgemLayout = new javax.swing.GroupLayout(areaEnergiaVirgem);
        areaEnergiaVirgem.setLayout(areaEnergiaVirgemLayout);
        areaEnergiaVirgemLayout.setHorizontalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                        .addComponent(amorVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorVirgem)
                    .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                        .addComponent(trabalhoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoVirgem)
                    .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                        .addComponent(saudeVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeVirgem)
                    .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                        .addComponent(sorteVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteVirgem)
                    .addComponent(tituloEnergiaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaVirgemLayout.setVerticalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorVirgem)
                .addGap(16, 16, 16)
                .addComponent(trabalhoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeVirgem)
                .addGap(15, 15, 15)
                .addComponent(sorteVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteVirgem)
                .addGap(51, 51, 51))
        );

        virgem.add(areaEnergiaVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemVirgem.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemVirgem.setText("Mensagem do dia");

        txtMensagemVirgem.setColumns(20);
        txtMensagemVirgem.setRows(5);
        txtMensagemVirgem.setText("Nem tudo precisa ser perfeito para dar certo.");
        txMensagemVirgem.setViewportView(txtMensagemVirgem);

        btnCopiarMsgVirgem.setBackground(new java.awt.Color(51, 51, 255));
        btnCopiarMsgVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgVirgem.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemVirgemLayout = new javax.swing.GroupLayout(areaMensagemVirgem);
        areaMensagemVirgem.setLayout(areaMensagemVirgemLayout);
        areaMensagemVirgemLayout.setHorizontalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemVirgemLayout.setVerticalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgVirgem)
                .addGap(20, 20, 20))
        );

        virgem.add(areaMensagemVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoVirgem.setText("jLabel1");
        virgem.add(fundoVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Virgem", virgem);

        libra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaLibra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaLibra.setText("Características");

        pfortesLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesLibra.setText("Pontos Fortes:");

        pMelhorarLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarLibra.setText("Pontos a Melhorar:");

        txFortesLibra.setColumns(20);
        txFortesLibra.setRows(5);
        txFortesLibra.setText("Diplomacia, simpatia, criatividade e capacidade de conciliar.");
        jScrollPane13.setViewportView(txFortesLibra);

        txMelhorarLibra.setColumns(20);
        txMelhorarLibra.setRows(5);
        txMelhorarLibra.setText("Indecisão, dificuldade em dizer não e preocupação com a opinião dos outros.");
        jScrollPane14.setViewportView(txMelhorarLibra);

        javax.swing.GroupLayout areaCaracteristicasLibraLayout = new javax.swing.GroupLayout(areaCaracteristicasLibra);
        areaCaracteristicasLibra.setLayout(areaCaracteristicasLibraLayout);
        areaCaracteristicasLibraLayout.setHorizontalGroup(
            areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane13)
                    .addComponent(pMelhorarLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane14))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasLibraLayout.setVerticalGroup(
            areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14)
                .addGap(27, 27, 27))
        );

        libra.add(areaCaracteristicasLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Libra.png")); // NOI18N

        tituloLibra.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloLibra.setText("Libra");

        periodoLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoLibra.setText("PERIODO:");

        elementoLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoLibra.setText("ELEMENTO:");

        planetaLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaLibra.setText("PLANETA REGENTE:");

        corLibra.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corLibra.setText("COR:");

        numeroLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroLibra.setText("NÚMERO DA SORTE:");

        tfPeriodoLibra.setText("23/09 a 22/10");
        tfPeriodoLibra.addActionListener(this::tfPeriodoLibraActionPerformed);

        tfElementoLibra.setText("Ar");

        tfPlanetaLibra.setText("Venus");

        tfCorLibra.setText("Rosa");

        tfNumeroLibra.setText("7");

        javax.swing.GroupLayout areaInformacoesLibraLayout = new javax.swing.GroupLayout(areaInformacoesLibra);
        areaInformacoesLibra.setLayout(areaInformacoesLibraLayout);
        areaInformacoesLibraLayout.setHorizontalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                            .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaLibra)
                                .addComponent(tfNumeroLibra)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLibraLayout.createSequentialGroup()
                            .addComponent(elementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoLibra))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLibraLayout.createSequentialGroup()
                            .addComponent(periodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                            .addComponent(corLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorLibra))))
                .addGap(10, 10, 10))
        );
        areaInformacoesLibraLayout.setVerticalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoLibra)
                    .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLibra)
                    .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLibra)
                    .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLibra)
                    .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLibra)
                    .addComponent(tfNumeroLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        libra.add(areaInformacoesLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoLibra.setText("Previsão do Dia:");

        txtPrevisaoLibra.setColumns(20);
        txtPrevisaoLibra.setRows(5);
        txtPrevisaoLibra.setText("O equilíbrio será importante para lidar com as situações do dia. No amor, momentos agradáveis podem fortalecer relacionamentos. No trabalho, procure ouvir todos os lados antes de decidir.");
        txPrevisaoLibra.setViewportView(txtPrevisaoLibra);

        btnAtualizarPrevisaoLibra.setBackground(new java.awt.Color(51, 51, 255));
        btnAtualizarPrevisaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoLibra.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoLibraLayout = new javax.swing.GroupLayout(areaPrevisaoLibra);
        areaPrevisaoLibra.setLayout(areaPrevisaoLibraLayout);
        areaPrevisaoLibraLayout.setHorizontalGroup(
            areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoLibra)
                    .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoLibraLayout.setVerticalGroup(
            areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        libra.add(areaPrevisaoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaLibra.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaLibra.setText("Energia do Dia");

        trabalhoLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoLibra.setText("Trabalho:");

        sorteLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteLibra.setText("Sorte:");

        amorLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorLibra.setText("Amor:");

        saudeLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeLibra.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaLibraLayout = new javax.swing.GroupLayout(areaEnergiaLibra);
        areaEnergiaLibra.setLayout(areaEnergiaLibraLayout);
        areaEnergiaLibraLayout.setHorizontalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(amorLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorLibra)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(trabalhoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoLibra)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(saudeLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeLibra)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(sorteLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteLibra)
                    .addComponent(tituloEnergiaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaLibraLayout.setVerticalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLibra)
                .addGap(16, 16, 16)
                .addComponent(trabalhoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeLibra)
                .addGap(15, 15, 15)
                .addComponent(sorteLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteLibra)
                .addGap(51, 51, 51))
        );

        libra.add(areaEnergiaLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemLibra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemLibra.setText("Mensagem do dia");

        txtMensagemLibra.setColumns(20);
        txtMensagemLibra.setRows(5);
        txtMensagemLibra.setText("Escolha aquilo que traz equilíbrio para sua vida.");
        txMensagemLibra.setViewportView(txtMensagemLibra);

        btnCopiarMsgLibra.setBackground(new java.awt.Color(51, 51, 255));
        btnCopiarMsgLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgLibra.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLibraLayout = new javax.swing.GroupLayout(areaMensagemLibra);
        areaMensagemLibra.setLayout(areaMensagemLibraLayout);
        areaMensagemLibraLayout.setHorizontalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemLibraLayout.setVerticalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgLibra)
                .addGap(20, 20, 20))
        );

        libra.add(areaMensagemLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoLibra.setText("jLabel1");
        libra.add(fundoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Libra", libra);

        escorpiao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaEscorpiao.setText("Características");

        pfortesEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesEscorpiao.setText("Pontos Fortes:");

        pMelhorarEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarEscorpiao.setText("Pontos a Melhorar:");

        txFortesEscorpiao.setColumns(20);
        txFortesEscorpiao.setRows(5);
        txFortesEscorpiao.setText("Determinação, intensidade, coragem e capacidade de transformação.");
        jScrollPane15.setViewportView(txFortesEscorpiao);

        txMelhorarEscorpiao.setColumns(20);
        txMelhorarEscorpiao.setRows(5);
        txMelhorarEscorpiao.setText("Desconfiança, ciúmes e dificuldade em esquecer situações passadas.");
        jScrollPane16.setViewportView(txMelhorarEscorpiao);

        javax.swing.GroupLayout areaCaracteristicasEscorpiaoLayout = new javax.swing.GroupLayout(areaCaracteristicasEscorpiao);
        areaCaracteristicasEscorpiao.setLayout(areaCaracteristicasEscorpiaoLayout);
        areaCaracteristicasEscorpiaoLayout.setHorizontalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane15)
                    .addComponent(pMelhorarEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane16))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasEscorpiaoLayout.setVerticalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16)
                .addGap(27, 27, 27))
        );

        escorpiao.add(areaCaracteristicasEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Escorpiao.png")); // NOI18N

        tituloEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEscorpiao.setText("Escorpião");

        periodoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoEscorpiao.setText("PERIODO:");

        elementoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoEscorpiao.setText("ELEMENTO:");

        planetaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaEscorpiao.setText("PLANETA REGENTE:");

        corEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corEscorpiao.setText("COR:");

        numeroEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroEscorpiao.setText("NÚMERO DA SORTE:");

        tfPeriodoEscorpiao.setText("23/10 a 21/11");

        tfElementoEscorpiao.setText("Água");

        tfPlanetaEscorpiao.setText("Plutão");

        tfCorEscorpiao.setText("Vinho");

        tfNumeroEscorpiao.setText("8");

        javax.swing.GroupLayout areaInformacoesEscorpiaoLayout = new javax.swing.GroupLayout(areaInformacoesEscorpiao);
        areaInformacoesEscorpiao.setLayout(areaInformacoesEscorpiaoLayout);
        areaInformacoesEscorpiaoLayout.setHorizontalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaEscorpiao)
                                .addComponent(tfNumeroEscorpiao)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(elementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoEscorpiao))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(periodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(corEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorEscorpiao))))
                .addGap(10, 10, 10))
        );
        areaInformacoesEscorpiaoLayout.setVerticalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoEscorpiao)
                    .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoEscorpiao)
                    .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaEscorpiao)
                    .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corEscorpiao)
                    .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroEscorpiao)
                    .addComponent(tfNumeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        escorpiao.add(areaInformacoesEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoEscorpiao.setText("Previsão do Dia:");

        txtPrevisaoEscorpiao.setColumns(20);
        txtPrevisaoEscorpiao.setRows(5);
        txtPrevisaoEscorpiao.setText("Sua determinação poderá ajudar a superar um obstáculo. No trabalho, mantenha o foco nos seus objetivos. No amor, confiança e sinceridade serão fundamentais.");
        txPrevisaoEscorpiao.setViewportView(txtPrevisaoEscorpiao);

        btnAtualizarPrevisaoEscorpiao.setBackground(new java.awt.Color(51, 51, 255));
        btnAtualizarPrevisaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoEscorpiao.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoEscorpiaoLayout = new javax.swing.GroupLayout(areaPrevisaoEscorpiao);
        areaPrevisaoEscorpiao.setLayout(areaPrevisaoEscorpiaoLayout);
        areaPrevisaoEscorpiaoLayout.setHorizontalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoEscorpiao)
                    .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoEscorpiaoLayout.setVerticalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        escorpiao.add(areaPrevisaoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaEscorpiao.setText("Energia do Dia");

        trabalhoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoEscorpiao.setText("Trabalho:");

        sorteEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteEscorpiao.setText("Sorte:");

        amorEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorEscorpiao.setText("Amor:");

        saudeEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeEscorpiao.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaEscorpiaoLayout = new javax.swing.GroupLayout(areaEnergiaEscorpiao);
        areaEnergiaEscorpiao.setLayout(areaEnergiaEscorpiaoLayout);
        areaEnergiaEscorpiaoLayout.setHorizontalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(amorEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorEscorpiao)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(trabalhoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoEscorpiao)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(saudeEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeEscorpiao)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(sorteEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteEscorpiao)
                    .addComponent(tituloEnergiaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaEscorpiaoLayout.setVerticalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorEscorpiao)
                .addGap(16, 16, 16)
                .addComponent(trabalhoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeEscorpiao)
                .addGap(15, 15, 15)
                .addComponent(sorteEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteEscorpiao)
                .addGap(51, 51, 51))
        );

        escorpiao.add(areaEnergiaEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemEscorpiao.setText("Mensagem do dia");

        txtMensagemEscorpiao.setColumns(20);
        txtMensagemEscorpiao.setRows(5);
        txtMensagemEscorpiao.setText("Transforme os desafios em força para seguir em frente.");
        txMensagemEscorpiao.setViewportView(txtMensagemEscorpiao);

        btnCopiarMsgEscorpiao.setBackground(new java.awt.Color(51, 51, 255));
        btnCopiarMsgEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgEscorpiao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemEscorpiaoLayout = new javax.swing.GroupLayout(areaMensagemEscorpiao);
        areaMensagemEscorpiao.setLayout(areaMensagemEscorpiaoLayout);
        areaMensagemEscorpiaoLayout.setHorizontalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemEscorpiaoLayout.setVerticalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgEscorpiao)
                .addGap(20, 20, 20))
        );

        escorpiao.add(areaMensagemEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoEscorpiao.setText("jLabel1");
        escorpiao.add(fundoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Escorpião", escorpiao);

        sagitario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaSagitario.setText("Características");

        pfortesSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesSagitario.setText("Pontos Fortes:");

        pMelhorarSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarSagitario.setText("Pontos a Melhorar:");

        txFortesSagitario.setColumns(20);
        txFortesSagitario.setRows(5);
        txFortesSagitario.setText("Otimismo, sinceridade, aventura e entusiasmo.");
        jScrollPane17.setViewportView(txFortesSagitario);

        txMelhorarSagitario.setColumns(20);
        txMelhorarSagitario.setRows(5);
        txMelhorarSagitario.setText("Impulsividade, exageros e dificuldade em manter o foco.");
        jScrollPane18.setViewportView(txMelhorarSagitario);

        javax.swing.GroupLayout areaCaracteristicasSagitarioLayout = new javax.swing.GroupLayout(areaCaracteristicasSagitario);
        areaCaracteristicasSagitario.setLayout(areaCaracteristicasSagitarioLayout);
        areaCaracteristicasSagitarioLayout.setHorizontalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane17)
                    .addComponent(pMelhorarSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane18))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasSagitarioLayout.setVerticalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18)
                .addGap(27, 27, 27))
        );

        sagitario.add(areaCaracteristicasSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Sagitario.png")); // NOI18N

        tituloSagitario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloSagitario.setText("Sagiatário");

        periodoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoSagitario.setText("PERIODO:");

        elementoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoSagitario.setText("ELEMENTO:");

        planetaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaSagitario.setText("PLANETA REGENTE:");

        corSagitario.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corSagitario.setText("COR:");

        numeroSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroSagitario.setText("NÚMERO DA SORTE:");

        tfPeriodoSagitario.setText("22/11 a 21/12");

        tfElementoSagitario.setText("Fogo");

        tfPlanetaSagitario.setText("Júpiter");

        tfCorSagitario.setText("Roxo");

        tfNumeroSagitario.setText("3");

        javax.swing.GroupLayout areaInformacoesSagitarioLayout = new javax.swing.GroupLayout(areaInformacoesSagitario);
        areaInformacoesSagitario.setLayout(areaInformacoesSagitarioLayout);
        areaInformacoesSagitarioLayout.setHorizontalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaSagitario)
                                .addComponent(tfNumeroSagitario)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(elementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoSagitario))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(periodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(corSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorSagitario))))
                .addGap(10, 10, 10))
        );
        areaInformacoesSagitarioLayout.setVerticalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoSagitario)
                    .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoSagitario)
                    .addComponent(tfElementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaSagitario)
                    .addComponent(tfPlanetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corSagitario)
                    .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroSagitario)
                    .addComponent(tfNumeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        sagitario.add(areaInformacoesSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoSagitario.setText("Previsão do Dia:");

        txtPrevisaoSagitario.setColumns(20);
        txtPrevisaoSagitario.setRows(5);
        txtPrevisaoSagitario.setText("O dia favorece novas experiências e oportunidades. Uma ideia diferente pode trazer bons resultados no trabalho. No amor, seja sincero, mas cuide para não falar sem pensar.");
        txPrevisaoSagitario.setViewportView(txtPrevisaoSagitario);

        btnAtualizarPrevisaoSagitario.setBackground(new java.awt.Color(51, 51, 255));
        btnAtualizarPrevisaoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoSagitario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoSagitario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoSagitarioLayout = new javax.swing.GroupLayout(areaPrevisaoSagitario);
        areaPrevisaoSagitario.setLayout(areaPrevisaoSagitarioLayout);
        areaPrevisaoSagitarioLayout.setHorizontalGroup(
            areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoSagitario)
                    .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoSagitarioLayout.setVerticalGroup(
            areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        sagitario.add(areaPrevisaoSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaSagitario.setText("Energia do Dia");

        trabalhoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoSagitario.setText("Trabalho:");

        sorteSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteSagitario.setText("Sorte:");

        amorSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorSagitario.setText("Amor:");

        saudeSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeSagitario.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaSagitarioLayout = new javax.swing.GroupLayout(areaEnergiaSagitario);
        areaEnergiaSagitario.setLayout(areaEnergiaSagitarioLayout);
        areaEnergiaSagitarioLayout.setHorizontalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(amorSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorSagitario)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(trabalhoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoSagitario)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(saudeSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeSagitario)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(sorteSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteSagitario)
                    .addComponent(tituloEnergiaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaSagitarioLayout.setVerticalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorSagitario)
                .addGap(16, 16, 16)
                .addComponent(trabalhoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeSagitario)
                .addGap(15, 15, 15)
                .addComponent(sorteSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteSagitario)
                .addGap(51, 51, 51))
        );

        sagitario.add(areaEnergiaSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemSagitario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemSagitario.setText("Mensagem do dia");

        txtMensagemSagitario.setColumns(20);
        txtMensagemSagitario.setRows(5);
        txtMensagemSagitario.setText("Mantenha o otimismo e permita-se explorar novos caminhos.");
        txMensagemSagitario.setViewportView(txtMensagemSagitario);

        btnCopiarMsgSagitario.setBackground(new java.awt.Color(51, 51, 255));
        btnCopiarMsgSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgSagitario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgSagitario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemSagitarioLayout = new javax.swing.GroupLayout(areaMensagemSagitario);
        areaMensagemSagitario.setLayout(areaMensagemSagitarioLayout);
        areaMensagemSagitarioLayout.setHorizontalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemSagitarioLayout.setVerticalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgSagitario)
                .addGap(20, 20, 20))
        );

        sagitario.add(areaMensagemSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoSagitario.setText("jLabel1");
        sagitario.add(fundoSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Sagitário", sagitario);

        capricornio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaCapricornio.setText("Características");

        pfortesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesCapricornio.setText("Pontos Fortes:");

        pMelhorarCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarCapricornio.setText("Pontos a Melhorar:");

        txFortesCapricornio.setColumns(20);
        txFortesCapricornio.setRows(5);
        txFortesCapricornio.setText("Disciplina, responsabilidade, foco e perseverança.");
        jScrollPane19.setViewportView(txFortesCapricornio);

        txMelhorarCapricornio.setColumns(20);
        txMelhorarCapricornio.setRows(5);
        txMelhorarCapricornio.setText("Rigidez, excesso de cobrança e dificuldade para relaxar.");
        jScrollPane20.setViewportView(txMelhorarCapricornio);

        javax.swing.GroupLayout areaCaracteristicasCapricornioLayout = new javax.swing.GroupLayout(areaCaracteristicasCapricornio);
        areaCaracteristicasCapricornio.setLayout(areaCaracteristicasCapricornioLayout);
        areaCaracteristicasCapricornioLayout.setHorizontalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane19)
                    .addComponent(pMelhorarCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane20))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasCapricornioLayout.setVerticalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20)
                .addGap(27, 27, 27))
        );

        capricornio.add(areaCaracteristicasCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Capricornio.png")); // NOI18N

        tituloCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloCapricornio.setText("Capricórnio");

        periodoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoCapricornio.setText("PERIODO:");

        elementoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoCapricornio.setText("ELEMENTO:");

        planetaCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaCapricornio.setText("PLANETA REGENTE:");

        corCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corCapricornio.setText("COR:");

        numeroCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroCapricornio.setText("NÚMERO DA SORTE:");

        tfPeriodoCapricornio.setText("22/12 a 19/01");

        tfElementoCapricornio.setText("Terra");

        tfPlanetaCapricornio.setText("Saturno");

        tfCorCapricornio.setText("Cinza");

        tfNumeroCapricornio.setText("10");

        javax.swing.GroupLayout areaInformacoesCapricornioLayout = new javax.swing.GroupLayout(areaInformacoesCapricornio);
        areaInformacoesCapricornio.setLayout(areaInformacoesCapricornioLayout);
        areaInformacoesCapricornioLayout.setHorizontalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaCapricornio)
                                .addComponent(tfNumeroCapricornio)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(elementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoCapricornio))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(periodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(corCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorCapricornio))))
                .addGap(10, 10, 10))
        );
        areaInformacoesCapricornioLayout.setVerticalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoCapricornio)
                    .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoCapricornio)
                    .addComponent(tfElementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCapricornio)
                    .addComponent(tfPlanetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCapricornio)
                    .addComponent(tfCorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCapricornio)
                    .addComponent(tfNumeroCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        capricornio.add(areaInformacoesCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoCapricornio.setText("Previsão do Dia:");

        txtPrevisaoCapricornio.setColumns(20);
        txtPrevisaoCapricornio.setRows(5);
        txtPrevisaoCapricornio.setText("Sua disciplina será importante para alcançar seus objetivos. No trabalho, mantenha o planejamento e evite decisões precipitadas. Reserve um tempo para descansar.");
        txPrevisaoCapricornio.setViewportView(txtPrevisaoCapricornio);

        btnAtualizarPrevisaoCapricornio.setBackground(new java.awt.Color(51, 51, 255));
        btnAtualizarPrevisaoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoCapricornio.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoCapricornioLayout = new javax.swing.GroupLayout(areaPrevisaoCapricornio);
        areaPrevisaoCapricornio.setLayout(areaPrevisaoCapricornioLayout);
        areaPrevisaoCapricornioLayout.setHorizontalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoCapricornio)
                    .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoCapricornioLayout.setVerticalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        capricornio.add(areaPrevisaoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaCapricornio.setText("Energia do Dia");

        trabalhoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoCapricornio.setText("Trabalho:");

        sorteCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteCapricornio.setText("Sorte:");

        amorCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorCapricornio.setText("Amor:");

        saudeCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeCapricornio.setText("Saúde:");

        javax.swing.GroupLayout areaCapricornioLayout = new javax.swing.GroupLayout(areaCapricornio);
        areaCapricornio.setLayout(areaCapricornioLayout);
        areaCapricornioLayout.setHorizontalGroup(
            areaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCapricornioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCapricornioLayout.createSequentialGroup()
                        .addComponent(amorCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorCapricornio)
                    .addGroup(areaCapricornioLayout.createSequentialGroup()
                        .addComponent(trabalhoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoCapricornio)
                    .addGroup(areaCapricornioLayout.createSequentialGroup()
                        .addComponent(saudeCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeCapricornio)
                    .addGroup(areaCapricornioLayout.createSequentialGroup()
                        .addComponent(sorteCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteCapricornio)
                    .addComponent(tituloEnergiaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaCapricornioLayout.setVerticalGroup(
            areaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCapricornioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCapricornio)
                .addGap(16, 16, 16)
                .addComponent(trabalhoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeCapricornio)
                .addGap(15, 15, 15)
                .addComponent(sorteCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteCapricornio)
                .addGap(51, 51, 51))
        );

        capricornio.add(areaCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemCapricornio.setText("Mensagem do dia");

        txtMensagemCapricornio.setColumns(20);
        txtMensagemCapricornio.setRows(5);
        txtMensagemCapricornio.setText("Cada pequeno passo também faz parte da conquista.");
        txMensagemCapricornio.setViewportView(txtMensagemCapricornio);

        btnCopiarMsgCapricornio.setBackground(new java.awt.Color(51, 51, 255));
        btnCopiarMsgCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgCapricornio.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemCapricornioLayout = new javax.swing.GroupLayout(areaMensagemCapricornio);
        areaMensagemCapricornio.setLayout(areaMensagemCapricornioLayout);
        areaMensagemCapricornioLayout.setHorizontalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemCapricornioLayout.setVerticalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgCapricornio)
                .addGap(20, 20, 20))
        );

        capricornio.add(areaMensagemCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoCapricornio.setText("jLabel1");
        capricornio.add(fundoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Capricórnio", capricornio);

        aquario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaAquario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaAquario.setText("Características");

        pfortesAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesAquario.setText("Pontos Fortes:");

        pMelhorarAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarAquario.setText("Pontos a Melhorar:");

        txFortesAquario.setColumns(20);
        txFortesAquario.setRows(5);
        txFortesAquario.setText("Originalidade, criatividade, independência e inteligência.");
        jScrollPane21.setViewportView(txFortesAquario);

        txMelhorarAquario.setColumns(20);
        txMelhorarAquario.setRows(5);
        txMelhorarAquario.setText("Distanciamento, teimosia e dificuldade em seguir padrões.");
        jScrollPane22.setViewportView(txMelhorarAquario);

        javax.swing.GroupLayout areaCaracteristicasAquarioLayout = new javax.swing.GroupLayout(areaCaracteristicasAquario);
        areaCaracteristicasAquario.setLayout(areaCaracteristicasAquarioLayout);
        areaCaracteristicasAquarioLayout.setHorizontalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tituloCaracteristicaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                            .addComponent(pMelhorarAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane22))))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasAquarioLayout.setVerticalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(tituloCaracteristicaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pfortesAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        aquario.add(areaCaracteristicasAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 510, 430));

        imgSignoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Aquario.png")); // NOI18N

        tituloAquario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloAquario.setText("Aquário");

        periodoAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoAquario.setText("PERIODO:");

        elementoAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoAquario.setText("ELEMENTO:");

        planetaAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaAquario.setText("PLANETA REGENTE:");

        corAquario.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corAquario.setText("COR:");

        numeroAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroAquario.setText("NÚMERO DA SORTE:");

        tfPeriodoAquario.setText("20/01 a 18/02");

        tfElementoAquario.setText("Ar");

        tfPlanetaAquario.setText("Urano");

        tfCorAquario.setText("Azul");

        tfNumeroAquario.setText("11");

        javax.swing.GroupLayout areaInformacoesAquarioLayout = new javax.swing.GroupLayout(areaInformacoesAquario);
        areaInformacoesAquario.setLayout(areaInformacoesAquarioLayout);
        areaInformacoesAquarioLayout.setHorizontalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaAquario)
                                .addComponent(tfNumeroAquario)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAquarioLayout.createSequentialGroup()
                            .addComponent(elementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoAquario))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAquarioLayout.createSequentialGroup()
                            .addComponent(periodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                            .addComponent(corAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorAquario))))
                .addGap(10, 10, 10))
        );
        areaInformacoesAquarioLayout.setVerticalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAquario)
                    .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAquario)
                    .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAquario)
                    .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAquario)
                    .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAquario)
                    .addComponent(tfNumeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        aquario.add(areaInformacoesAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoAquario.setText("Previsão do Dia:");

        txtPrevisaoAquario.setColumns(20);
        txtPrevisaoAquario.setRows(5);
        txtPrevisaoAquario.setText("Ideias novas podem surgir e ajudar você a encontrar soluções diferentes. No trabalho, sua criatividade estará em destaque. No amor, demonstre melhor aquilo que sente.");
        txPrevisaoAries10.setViewportView(txtPrevisaoAquario);

        btnAtualizarPrevisaoAquario.setBackground(new java.awt.Color(51, 51, 255));
        btnAtualizarPrevisaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoAquario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoAquarioLayout = new javax.swing.GroupLayout(areaPrevisaoAquario);
        areaPrevisaoAquario.setLayout(areaPrevisaoAquarioLayout);
        areaPrevisaoAquarioLayout.setHorizontalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries10)
                    .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoAquarioLayout.setVerticalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries10, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        aquario.add(areaPrevisaoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 520, 420));

        tituloEnergiaAquario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaAquario.setText("Energia do Dia");

        trabalhoAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoAquario.setText("Trabalho:");

        sorteAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteAquario.setText("Sorte:");

        amorAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorAquario.setText("Amor:");

        saudeAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeAquario.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaAquarioLayout = new javax.swing.GroupLayout(areaEnergiaAquario);
        areaEnergiaAquario.setLayout(areaEnergiaAquarioLayout);
        areaEnergiaAquarioLayout.setHorizontalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(amorAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorAquario)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(trabalhoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoAquario)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(saudeAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeAquario)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(sorteAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteAquario)
                    .addComponent(tituloEnergiaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaAquarioLayout.setVerticalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAquario)
                .addGap(16, 16, 16)
                .addComponent(trabalhoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeAquario)
                .addGap(15, 15, 15)
                .addComponent(sorteAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAquario)
                .addGap(51, 51, 51))
        );

        aquario.add(areaEnergiaAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemAquario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemAquario.setText("Mensagem do dia");

        txtMensagemAquario.setColumns(20);
        txtMensagemAquario.setRows(5);
        txtMensagemAquario.setText("Ser diferente pode ser justamente aquilo que faz você se destacar.");
        txMensagemAquario.setViewportView(txtMensagemAquario);

        btnCopiarMsgAquario.setBackground(new java.awt.Color(51, 51, 255));
        btnCopiarMsgAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgAquario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemAquarioLayout = new javax.swing.GroupLayout(areaMensagemAquario);
        areaMensagemAquario.setLayout(areaMensagemAquarioLayout);
        areaMensagemAquarioLayout.setHorizontalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemAquarioLayout.setVerticalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgAquario)
                .addGap(20, 20, 20))
        );

        aquario.add(areaMensagemAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoAquario.setText("jLabel1");
        aquario.add(fundoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Aquário", aquario);

        peixes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaPeixes.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaPeixes.setText("Características");

        pfortesPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesPeixes.setText("Pontos Fortes:");

        pMelhorarPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarPeixes.setText("Pontos a Melhorar:");

        txFortesPeixes.setColumns(20);
        txFortesPeixes.setRows(5);
        txFortesPeixes.setText("Empatia, criatividade, sensibilidade e imaginação.");
        jScrollPane23.setViewportView(txFortesPeixes);

        txMelhorarPeixes.setColumns(20);
        txMelhorarPeixes.setRows(5);
        txMelhorarPeixes.setText("Distração, insegurança e tendência a idealizar demais as situações.");
        jScrollPane24.setViewportView(txMelhorarPeixes);

        javax.swing.GroupLayout areaCaracteristicasPeixesLayout = new javax.swing.GroupLayout(areaCaracteristicasPeixes);
        areaCaracteristicasPeixes.setLayout(areaCaracteristicasPeixesLayout);
        areaCaracteristicasPeixesLayout.setHorizontalGroup(
            areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane23)
                    .addComponent(pMelhorarPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane24))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasPeixesLayout.setVerticalGroup(
            areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane24)
                .addGap(27, 27, 27))
        );

        peixes.add(areaCaracteristicasPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        imgSignoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Peixes.png")); // NOI18N

        tituloPeixes.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloPeixes.setText("Peixes");

        periodoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoPeixes.setText("PERIODO:");

        elementoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoPeixes.setText("ELEMENTO:");

        planetaPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaPeixes.setText("PLANETA REGENTE:");

        corPeixes.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corPeixes.setText("COR:");

        numeroPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroPeixes.setText("NÚMERO DA SORTE:");

        tfPeriodoPeixes.setText("19/02 a 20/03");

        tfElementoPeixes.setText("Água");

        tfPlanetaPeixes.setText("Netuno");

        tfCorPeixes.setText("Lilás");

        tfNumeroPeixes.setText("7");

        javax.swing.GroupLayout areaInformacoesPeixesLayout = new javax.swing.GroupLayout(areaInformacoesPeixes);
        areaInformacoesPeixes.setLayout(areaInformacoesPeixesLayout);
        areaInformacoesPeixesLayout.setHorizontalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                            .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaPeixes)
                                .addComponent(tfNumeroPeixes)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesPeixesLayout.createSequentialGroup()
                            .addComponent(elementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoPeixes))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesPeixesLayout.createSequentialGroup()
                            .addComponent(periodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                            .addComponent(corPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorPeixes))))
                .addGap(10, 10, 10))
        );
        areaInformacoesPeixesLayout.setVerticalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoPeixes)
                    .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoPeixes)
                    .addComponent(tfElementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaPeixes)
                    .addComponent(tfPlanetaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corPeixes)
                    .addComponent(tfCorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroPeixes)
                    .addComponent(tfNumeroPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        peixes.add(areaInformacoesPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoPeixes.setText("Previsão do Dia:");

        txtPrevisaoPeixes.setColumns(20);
        txtPrevisaoPeixes.setRows(5);
        txtPrevisaoPeixes.setText("Sua intuição pode ajudar em decisões importantes. No amor, o momento favorece carinho e aproximação. No trabalho, organize suas tarefas para não perder o foco.");
        txPrevisaoPeixes.setViewportView(txtPrevisaoPeixes);

        btnAtualizarPrevisaoPeixes.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoPeixes.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoPeixesLayout = new javax.swing.GroupLayout(areaPrevisaoPeixes);
        areaPrevisaoPeixes.setLayout(areaPrevisaoPeixesLayout);
        areaPrevisaoPeixesLayout.setHorizontalGroup(
            areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoPeixes)
                    .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoPeixesLayout.setVerticalGroup(
            areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        peixes.add(areaPrevisaoPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaPeixes.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaPeixes.setText("Energia do Dia");

        trabalhoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoPeixes.setText("Trabalho:");

        sortePeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sortePeixes.setText("Sorte:");

        amorPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorPeixes.setText("Amor:");

        saudePeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudePeixes.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaPeixesLayout = new javax.swing.GroupLayout(areaEnergiaPeixes);
        areaEnergiaPeixes.setLayout(areaEnergiaPeixesLayout);
        areaEnergiaPeixesLayout.setHorizontalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addComponent(amorPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorPeixes)
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addComponent(trabalhoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoPeixes)
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addComponent(saudePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudePeixes)
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addComponent(sortePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSortePeixes)
                    .addComponent(tituloEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaPeixesLayout.setVerticalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorPeixes)
                .addGap(16, 16, 16)
                .addComponent(trabalhoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudePeixes)
                .addGap(15, 15, 15)
                .addComponent(sortePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSortePeixes)
                .addGap(51, 51, 51))
        );

        peixes.add(areaEnergiaPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemPeixes.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemPeixes.setText("Mensagem do dia");

        txtMensagemPeixes.setColumns(20);
        txtMensagemPeixes.setRows(5);
        txtMensagemPeixes.setText("Confie na sua intuição, mas mantenha os pés no chão.");
        txMensagemPeixes.setViewportView(txtMensagemPeixes);

        btnCopiarMsgPeixes.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgPeixes.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemPeixesLayout = new javax.swing.GroupLayout(areaMensagemPeixes);
        areaMensagemPeixes.setLayout(areaMensagemPeixesLayout);
        areaMensagemPeixesLayout.setHorizontalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemPeixesLayout.setVerticalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgPeixes)
                .addGap(20, 20, 20))
        );

        peixes.add(areaMensagemPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        fundoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoPeixes.setText("jLabel1");
        peixes.add(fundoPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Peixes", peixes);

        fundoAries1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoAries1.setText("jLabel1");
        areaAbas.addTab("tab14", fundoAries1);

        fundoAries2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoAries2.setText("jLabel1");
        areaAbas.addTab("tab15", fundoAries2);

        fundoAries3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoAries3.setText("jLabel1");
        areaAbas.addTab("tab16", fundoAries3);

        fundoAries4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoAries4.setText("jLabel1");
        areaAbas.addTab("tab17", fundoAries4);

        fundoAries5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoAries5.setText("jLabel1");
        areaAbas.addTab("tab18", fundoAries5);

        fundoAries6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoAries6.setText("jLabel1");
        areaAbas.addTab("tab19", fundoAries6);

        fundoAries7.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoAries7.setText("jLabel1");
        areaAbas.addTab("tab20", fundoAries7);

        fundoAries8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoAries8.setText("jLabel1");
        areaAbas.addTab("tab21", fundoAries8);

        fundoAries9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ArthurAquino\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\image_be2129bb.jpg")); // NOI18N
        fundoAries9.setText("jLabel1");
        areaAbas.addTab("tab22", fundoAries9);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1590, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );

        areaAbas.addTab("tab23", jPanel1);

        getContentPane().add(areaAbas);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDiaActionPerformed

    private void tfPeriodoLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoLibraActionPerformed

    private void btnDescobrirSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescobrirSignoActionPerformed
        // TODO add your handling code here:
        CalcularSigno();
    }//GEN-LAST:event_btnDescobrirSignoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        CalcularCompatibilidade();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:
        TocarMusica();
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        // TODO add your handling code here:
        PausarMusica();
    }//GEN-LAST:event_btnPauseActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Signos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Compatibilidade;
    private javax.swing.JLabel amorAquario;
    private javax.swing.JLabel amorAries;
    private javax.swing.JLabel amorCancer;
    private javax.swing.JLabel amorCapricornio;
    private javax.swing.JLabel amorEscorpiao;
    private javax.swing.JLabel amorGemeos;
    private javax.swing.JLabel amorLeao;
    private javax.swing.JLabel amorLibra;
    private javax.swing.JLabel amorPeixes;
    private javax.swing.JLabel amorSagitario;
    private javax.swing.JLabel amorTouro;
    private javax.swing.JLabel amorVirgem;
    private javax.swing.JPanel aquario;
    private javax.swing.JTabbedPane areaAbas;
    private javax.swing.JPanel areaCapricornio;
    private javax.swing.JPanel areaCaracteristicasAquario;
    private javax.swing.JPanel areaCaracteristicasAries;
    private javax.swing.JPanel areaCaracteristicasCancer;
    private javax.swing.JPanel areaCaracteristicasCapricornio;
    private javax.swing.JPanel areaCaracteristicasEscorpiao;
    private javax.swing.JPanel areaCaracteristicasGemeos;
    private javax.swing.JPanel areaCaracteristicasLeao;
    private javax.swing.JPanel areaCaracteristicasLibra;
    private javax.swing.JPanel areaCaracteristicasPeixes;
    private javax.swing.JPanel areaCaracteristicasSagitario;
    private javax.swing.JPanel areaCaracteristicasTouro;
    private javax.swing.JPanel areaCaracteristicasVirgem;
    private javax.swing.JPanel areaComopatibilidade;
    private javax.swing.JPanel areaDescobrirSigno;
    private javax.swing.JPanel areaEnergiaAquario;
    private javax.swing.JPanel areaEnergiaAries;
    private javax.swing.JPanel areaEnergiaCancer;
    private javax.swing.JPanel areaEnergiaEscorpiao;
    private javax.swing.JPanel areaEnergiaGemeos;
    private javax.swing.JPanel areaEnergiaLeao;
    private javax.swing.JPanel areaEnergiaLibra;
    private javax.swing.JPanel areaEnergiaPeixes;
    private javax.swing.JPanel areaEnergiaSagitario;
    private javax.swing.JPanel areaEnergiaTouro;
    private javax.swing.JPanel areaEnergiaVirgem;
    private javax.swing.JPanel areaInformacoesAquario;
    private javax.swing.JPanel areaInformacoesAries;
    private javax.swing.JPanel areaInformacoesCancer;
    private javax.swing.JPanel areaInformacoesCapricornio;
    private javax.swing.JPanel areaInformacoesEscorpiao;
    private javax.swing.JPanel areaInformacoesGemeos;
    private javax.swing.JPanel areaInformacoesLeao;
    private javax.swing.JPanel areaInformacoesLibra;
    private javax.swing.JPanel areaInformacoesPeixes;
    private javax.swing.JPanel areaInformacoesSagitario;
    private javax.swing.JPanel areaInformacoesTouro;
    private javax.swing.JPanel areaInformacoesVirgem;
    private javax.swing.JPanel areaMensagemAquario;
    private javax.swing.JPanel areaMensagemAries;
    private javax.swing.JPanel areaMensagemCancer;
    private javax.swing.JPanel areaMensagemCapricornio;
    private javax.swing.JPanel areaMensagemEscorpiao;
    private javax.swing.JPanel areaMensagemGemeos;
    private javax.swing.JPanel areaMensagemLeao;
    private javax.swing.JPanel areaMensagemLibra;
    private javax.swing.JPanel areaMensagemPeixes;
    private javax.swing.JPanel areaMensagemSagitario;
    private javax.swing.JPanel areaMensagemTouro;
    private javax.swing.JPanel areaMensagemVirgem;
    private javax.swing.JPanel areaPrevisaoAquario;
    private javax.swing.JPanel areaPrevisaoAries;
    private javax.swing.JPanel areaPrevisaoCancer;
    private javax.swing.JPanel areaPrevisaoCapricornio;
    private javax.swing.JPanel areaPrevisaoEscorpiao;
    private javax.swing.JPanel areaPrevisaoGemeos;
    private javax.swing.JPanel areaPrevisaoLeao;
    private javax.swing.JPanel areaPrevisaoLibra;
    private javax.swing.JPanel areaPrevisaoPeixes;
    private javax.swing.JPanel areaPrevisaoSagitario;
    private javax.swing.JPanel areaPrevisaoTouro;
    private javax.swing.JPanel areaPrevisaoVirgem;
    private javax.swing.JPanel areaResultado;
    private javax.swing.JPanel aries;
    private javax.swing.JButton btnAtualizarPrevisaoAquario;
    private javax.swing.JButton btnAtualizarPrevisaoAries;
    private javax.swing.JButton btnAtualizarPrevisaoCancer;
    private javax.swing.JButton btnAtualizarPrevisaoCapricornio;
    private javax.swing.JButton btnAtualizarPrevisaoEscorpiao;
    private javax.swing.JButton btnAtualizarPrevisaoGemeos;
    private javax.swing.JButton btnAtualizarPrevisaoLeao;
    private javax.swing.JButton btnAtualizarPrevisaoLibra;
    private javax.swing.JButton btnAtualizarPrevisaoPeixes;
    private javax.swing.JButton btnAtualizarPrevisaoSagitario;
    private javax.swing.JButton btnAtualizarPrevisaoTouro;
    private javax.swing.JButton btnAtualizarPrevisaoVirgem;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCopiarMsgAquario;
    private javax.swing.JButton btnCopiarMsgAries;
    private javax.swing.JButton btnCopiarMsgCancer;
    private javax.swing.JButton btnCopiarMsgCapricornio;
    private javax.swing.JButton btnCopiarMsgEscorpiao;
    private javax.swing.JButton btnCopiarMsgGemeos;
    private javax.swing.JButton btnCopiarMsgLeao;
    private javax.swing.JButton btnCopiarMsgLibra;
    private javax.swing.JButton btnCopiarMsgPeixes;
    private javax.swing.JButton btnCopiarMsgSagitario;
    private javax.swing.JButton btnCopiarMsgTouro;
    private javax.swing.JButton btnCopiarMsgVirgem;
    private javax.swing.JButton btnDescobrirSigno;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnSigno;
    private javax.swing.JPanel cancer;
    private javax.swing.JPanel capricornio;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbSigno1;
    private javax.swing.JComboBox<String> cbSigno2;
    private javax.swing.JLabel corAquario;
    private javax.swing.JLabel corAries;
    private javax.swing.JLabel corCancer;
    private javax.swing.JLabel corCapricornio;
    private javax.swing.JLabel corEscorpiao;
    private javax.swing.JLabel corGemeos;
    private javax.swing.JLabel corLeao;
    private javax.swing.JLabel corLibra;
    private javax.swing.JLabel corPeixes;
    private javax.swing.JLabel corSagitario;
    private javax.swing.JLabel corTouro;
    private javax.swing.JLabel corVirgem;
    private javax.swing.JLabel elementoAquario;
    private javax.swing.JLabel elementoAries;
    private javax.swing.JLabel elementoCancer;
    private javax.swing.JLabel elementoCapricornio;
    private javax.swing.JLabel elementoEscorpiao;
    private javax.swing.JLabel elementoGemeos;
    private javax.swing.JLabel elementoLeao;
    private javax.swing.JLabel elementoLibra;
    private javax.swing.JLabel elementoPeixes;
    private javax.swing.JLabel elementoSagitario;
    private javax.swing.JLabel elementoTouro;
    private javax.swing.JLabel elementoVirgem;
    private javax.swing.JPanel escorpiao;
    private javax.swing.JLabel fundoAquario;
    private javax.swing.JLabel fundoAries;
    private javax.swing.JLabel fundoAries1;
    private javax.swing.JLabel fundoAries2;
    private javax.swing.JLabel fundoAries3;
    private javax.swing.JLabel fundoAries4;
    private javax.swing.JLabel fundoAries5;
    private javax.swing.JLabel fundoAries6;
    private javax.swing.JLabel fundoAries7;
    private javax.swing.JLabel fundoAries8;
    private javax.swing.JLabel fundoAries9;
    private javax.swing.JLabel fundoCancer;
    private javax.swing.JLabel fundoCapricornio;
    private javax.swing.JLabel fundoEscorpiao;
    private javax.swing.JLabel fundoGemeos;
    private javax.swing.JLabel fundoInicio;
    private javax.swing.JLabel fundoLeao;
    private javax.swing.JLabel fundoLibra;
    private javax.swing.JLabel fundoPeixes;
    private javax.swing.JLabel fundoSagitario;
    private javax.swing.JLabel fundoTouro;
    private javax.swing.JLabel fundoVirgem;
    private javax.swing.JPanel gemeos;
    private javax.swing.JLabel imgSignoAquario;
    private javax.swing.JLabel imgSignoAries;
    private javax.swing.JLabel imgSignoCancer;
    private javax.swing.JLabel imgSignoCapricornio;
    private javax.swing.JLabel imgSignoEscorpiao;
    private javax.swing.JLabel imgSignoGemeos;
    private javax.swing.JLabel imgSignoLeao;
    private javax.swing.JLabel imgSignoLibra;
    private javax.swing.JLabel imgSignoPeixes;
    private javax.swing.JLabel imgSignoSagitario;
    private javax.swing.JLabel imgSignoTouro;
    private javax.swing.JLabel imgSignoVirgem;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel leao;
    private javax.swing.JPanel libra;
    private javax.swing.JLabel numeroAquario;
    private javax.swing.JLabel numeroAries;
    private javax.swing.JLabel numeroCancer;
    private javax.swing.JLabel numeroCapricornio;
    private javax.swing.JLabel numeroEscorpiao;
    private javax.swing.JLabel numeroGemeos;
    private javax.swing.JLabel numeroLeao;
    private javax.swing.JLabel numeroLibra;
    private javax.swing.JLabel numeroPeixes;
    private javax.swing.JLabel numeroSagitario;
    private javax.swing.JLabel numeroTouro;
    private javax.swing.JLabel numeroVirgem;
    private javax.swing.JLabel pMelhorarAquario;
    private javax.swing.JLabel pMelhorarAries;
    private javax.swing.JLabel pMelhorarCancer;
    private javax.swing.JLabel pMelhorarCapricornio;
    private javax.swing.JLabel pMelhorarEscorpiao;
    private javax.swing.JLabel pMelhorarGemeos;
    private javax.swing.JLabel pMelhorarLeao;
    private javax.swing.JLabel pMelhorarLibra;
    private javax.swing.JLabel pMelhorarPeixes;
    private javax.swing.JLabel pMelhorarSagitario;
    private javax.swing.JLabel pMelhorarTouro;
    private javax.swing.JLabel pMelhorarVirgem;
    private javax.swing.JPanel peixes;
    private javax.swing.JLabel periodoAquario;
    private javax.swing.JLabel periodoAries;
    private javax.swing.JLabel periodoCancer;
    private javax.swing.JLabel periodoCapricornio;
    private javax.swing.JLabel periodoEscorpiao;
    private javax.swing.JLabel periodoGemeos;
    private javax.swing.JLabel periodoLeao;
    private javax.swing.JLabel periodoLibra;
    private javax.swing.JLabel periodoPeixes;
    private javax.swing.JLabel periodoSagitario;
    private javax.swing.JLabel periodoTouro;
    private javax.swing.JLabel periodoVirgem;
    private javax.swing.JLabel pfortesAquario;
    private javax.swing.JLabel pfortesAries;
    private javax.swing.JLabel pfortesCancer;
    private javax.swing.JLabel pfortesCapricornio;
    private javax.swing.JLabel pfortesEscorpiao;
    private javax.swing.JLabel pfortesGemeos;
    private javax.swing.JLabel pfortesLeao;
    private javax.swing.JLabel pfortesLibra;
    private javax.swing.JLabel pfortesPeixes;
    private javax.swing.JLabel pfortesSagitario;
    private javax.swing.JLabel pfortesTouro;
    private javax.swing.JLabel pfortesVirgem;
    private javax.swing.JLabel planetaAquario;
    private javax.swing.JLabel planetaAries;
    private javax.swing.JLabel planetaCancer;
    private javax.swing.JLabel planetaCapricornio;
    private javax.swing.JLabel planetaEscorpiao;
    private javax.swing.JLabel planetaGemeos;
    private javax.swing.JLabel planetaLeao;
    private javax.swing.JLabel planetaLibra;
    private javax.swing.JLabel planetaPeixes;
    private javax.swing.JLabel planetaSagitario;
    private javax.swing.JLabel planetaTouro;
    private javax.swing.JLabel planetaVirgem;
    private javax.swing.JLabel previsaoAquario;
    private javax.swing.JLabel previsaoAries;
    private javax.swing.JLabel previsaoCancer;
    private javax.swing.JLabel previsaoCapricornio;
    private javax.swing.JLabel previsaoEscorpiao;
    private javax.swing.JLabel previsaoGemeos;
    private javax.swing.JLabel previsaoLeao;
    private javax.swing.JLabel previsaoLibra;
    private javax.swing.JLabel previsaoPeixes;
    private javax.swing.JLabel previsaoSagitario;
    private javax.swing.JLabel previsaoTouro;
    private javax.swing.JLabel previsaoVirgem;
    private javax.swing.JPanel sagitario;
    private javax.swing.JLabel saudeAquario;
    private javax.swing.JLabel saudeAries;
    private javax.swing.JLabel saudeCancer;
    private javax.swing.JLabel saudeCapricornio;
    private javax.swing.JLabel saudeEscorpiao;
    private javax.swing.JLabel saudeGemeos;
    private javax.swing.JLabel saudeLeao;
    private javax.swing.JLabel saudeLibra;
    private javax.swing.JLabel saudePeixes;
    private javax.swing.JLabel saudeSagitario;
    private javax.swing.JLabel saudeTouro;
    private javax.swing.JLabel saudeVirgem;
    private javax.swing.JLabel signo;
    private javax.swing.JLabel signo1;
    private javax.swing.JLabel signo2;
    private javax.swing.JLabel sorteAquario;
    private javax.swing.JLabel sorteAries;
    private javax.swing.JLabel sorteCancer;
    private javax.swing.JLabel sorteCapricornio;
    private javax.swing.JLabel sorteEscorpiao;
    private javax.swing.JLabel sorteGemeos;
    private javax.swing.JLabel sorteLeao;
    private javax.swing.JLabel sorteLibra;
    private javax.swing.JLabel sortePeixes;
    private javax.swing.JLabel sorteSagitario;
    private javax.swing.JLabel sorteTouro;
    private javax.swing.JLabel sorteVirgem;
    private javax.swing.JTextField tfAmorAquario;
    private javax.swing.JTextField tfAmorAries;
    private javax.swing.JTextField tfAmorCancer;
    private javax.swing.JTextField tfAmorCapricornio;
    private javax.swing.JTextField tfAmorEscorpiao;
    private javax.swing.JTextField tfAmorGemeos;
    private javax.swing.JTextField tfAmorLeao;
    private javax.swing.JTextField tfAmorLibra;
    private javax.swing.JTextField tfAmorPeixes;
    private javax.swing.JTextField tfAmorSagitario;
    private javax.swing.JTextField tfAmorTouro;
    private javax.swing.JTextField tfAmorVirgem;
    private javax.swing.JTextField tfCompatibilidade;
    private javax.swing.JTextField tfCorAquario;
    private javax.swing.JTextField tfCorAries;
    private javax.swing.JTextField tfCorCancer;
    private javax.swing.JTextField tfCorCapricornio;
    private javax.swing.JTextField tfCorEscorpiao;
    private javax.swing.JTextField tfCorGemeos;
    private javax.swing.JTextField tfCorLeao;
    private javax.swing.JTextField tfCorLibra;
    private javax.swing.JTextField tfCorPeixes;
    private javax.swing.JTextField tfCorSagitario;
    private javax.swing.JTextField tfCorTouro;
    private javax.swing.JTextField tfCorVirgem;
    private javax.swing.JTextField tfElementoAquario;
    private javax.swing.JTextField tfElementoAries;
    private javax.swing.JTextField tfElementoCancer;
    private javax.swing.JTextField tfElementoCapricornio;
    private javax.swing.JTextField tfElementoEscorpiao;
    private javax.swing.JTextField tfElementoGemeos;
    private javax.swing.JTextField tfElementoLeao;
    private javax.swing.JTextField tfElementoLibra;
    private javax.swing.JTextField tfElementoPeixes;
    private javax.swing.JTextField tfElementoSagitario;
    private javax.swing.JTextField tfElementoTouro;
    private javax.swing.JTextField tfElementoVirgem;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumeroAquario;
    private javax.swing.JTextField tfNumeroAries;
    private javax.swing.JTextField tfNumeroCancer;
    private javax.swing.JTextField tfNumeroCapricornio;
    private javax.swing.JTextField tfNumeroEscorpiao;
    private javax.swing.JTextField tfNumeroGemeos;
    private javax.swing.JTextField tfNumeroLeao;
    private javax.swing.JTextField tfNumeroLibra;
    private javax.swing.JTextField tfNumeroPeixes;
    private javax.swing.JTextField tfNumeroSagitario;
    private javax.swing.JTextField tfNumeroTouro;
    private javax.swing.JTextField tfNumeroVirgem;
    private javax.swing.JTextField tfPeriodoAquario;
    private javax.swing.JTextField tfPeriodoAries;
    private javax.swing.JTextField tfPeriodoCancer;
    private javax.swing.JTextField tfPeriodoCapricornio;
    private javax.swing.JTextField tfPeriodoEscorpiao;
    private javax.swing.JTextField tfPeriodoGemeos;
    private javax.swing.JTextField tfPeriodoLeao;
    private javax.swing.JTextField tfPeriodoLibra;
    private javax.swing.JTextField tfPeriodoPeixes;
    private javax.swing.JTextField tfPeriodoSagitario;
    private javax.swing.JTextField tfPeriodoTouro;
    private javax.swing.JTextField tfPeriodoVirgem;
    private javax.swing.JTextField tfPlanetaAquario;
    private javax.swing.JTextField tfPlanetaAries;
    private javax.swing.JTextField tfPlanetaCancer;
    private javax.swing.JTextField tfPlanetaCapricornio;
    private javax.swing.JTextField tfPlanetaEscorpiao;
    private javax.swing.JTextField tfPlanetaGemeos;
    private javax.swing.JTextField tfPlanetaLeao;
    private javax.swing.JTextField tfPlanetaLibra;
    private javax.swing.JTextField tfPlanetaPeixes;
    private javax.swing.JTextField tfPlanetaSagitario;
    private javax.swing.JTextField tfPlanetaTouro;
    private javax.swing.JTextField tfPlanetaVirgem;
    private javax.swing.JTextField tfSaudeAquario;
    private javax.swing.JTextField tfSaudeAries;
    private javax.swing.JTextField tfSaudeCancer;
    private javax.swing.JTextField tfSaudeCapricornio;
    private javax.swing.JTextField tfSaudeEscorpiao;
    private javax.swing.JTextField tfSaudeGemeos;
    private javax.swing.JTextField tfSaudeLeao;
    private javax.swing.JTextField tfSaudeLibra;
    private javax.swing.JTextField tfSaudePeixes;
    private javax.swing.JTextField tfSaudeSagitario;
    private javax.swing.JTextField tfSaudeTouro;
    private javax.swing.JTextField tfSaudeVirgem;
    private javax.swing.JTextField tfSorteAquario;
    private javax.swing.JTextField tfSorteAries;
    private javax.swing.JTextField tfSorteCancer;
    private javax.swing.JTextField tfSorteCapricornio;
    private javax.swing.JTextField tfSorteEscorpiao;
    private javax.swing.JTextField tfSorteGemeos;
    private javax.swing.JTextField tfSorteLeao;
    private javax.swing.JTextField tfSorteLibra;
    private javax.swing.JTextField tfSortePeixes;
    private javax.swing.JTextField tfSorteSagitario;
    private javax.swing.JTextField tfSorteTouro;
    private javax.swing.JTextField tfSorteVirgem;
    private javax.swing.JTextField tfTrabalhoAquario;
    private javax.swing.JTextField tfTrabalhoAries;
    private javax.swing.JTextField tfTrabalhoCancer;
    private javax.swing.JTextField tfTrabalhoCapricornio;
    private javax.swing.JTextField tfTrabalhoEscorpiao;
    private javax.swing.JTextField tfTrabalhoGemeos;
    private javax.swing.JTextField tfTrabalhoLeao;
    private javax.swing.JTextField tfTrabalhoLibra;
    private javax.swing.JTextField tfTrabalhoPeixes;
    private javax.swing.JTextField tfTrabalhoSagitario;
    private javax.swing.JTextField tfTrabalhoTouro;
    private javax.swing.JTextField tfTrabalhoVirgem;
    private javax.swing.JLabel tituloAquario;
    private javax.swing.JLabel tituloAries;
    private javax.swing.JLabel tituloCancer;
    private javax.swing.JLabel tituloCapricornio;
    private javax.swing.JLabel tituloCaracteristicaAquario;
    private javax.swing.JLabel tituloCaracteristicaAries;
    private javax.swing.JLabel tituloCaracteristicaCancer;
    private javax.swing.JLabel tituloCaracteristicaCapricornio;
    private javax.swing.JLabel tituloCaracteristicaEscorpiao;
    private javax.swing.JLabel tituloCaracteristicaGemeos;
    private javax.swing.JLabel tituloCaracteristicaLeao;
    private javax.swing.JLabel tituloCaracteristicaLibra;
    private javax.swing.JLabel tituloCaracteristicaPeixes;
    private javax.swing.JLabel tituloCaracteristicaSagitario;
    private javax.swing.JLabel tituloCaracteristicaTouro;
    private javax.swing.JLabel tituloCaracteristicaVirgem;
    private javax.swing.JLabel tituloCompatibilidade;
    private javax.swing.JLabel tituloEnergiaAquario;
    private javax.swing.JLabel tituloEnergiaAries;
    private javax.swing.JLabel tituloEnergiaCancer;
    private javax.swing.JLabel tituloEnergiaCapricornio;
    private javax.swing.JLabel tituloEnergiaEscorpiao;
    private javax.swing.JLabel tituloEnergiaGemeos;
    private javax.swing.JLabel tituloEnergiaLeao;
    private javax.swing.JLabel tituloEnergiaLibra;
    private javax.swing.JLabel tituloEnergiaPeixes;
    private javax.swing.JLabel tituloEnergiaSagitario;
    private javax.swing.JLabel tituloEnergiaTouro;
    private javax.swing.JLabel tituloEnergiaVirgem;
    private javax.swing.JLabel tituloEscorpiao;
    private javax.swing.JLabel tituloGemeos;
    private javax.swing.JLabel tituloLeao;
    private javax.swing.JLabel tituloLibra;
    private javax.swing.JLabel tituloMensagemAquario;
    private javax.swing.JLabel tituloMensagemAries;
    private javax.swing.JLabel tituloMensagemCancer;
    private javax.swing.JLabel tituloMensagemCapricornio;
    private javax.swing.JLabel tituloMensagemEscorpiao;
    private javax.swing.JLabel tituloMensagemGemeos;
    private javax.swing.JLabel tituloMensagemLeao;
    private javax.swing.JLabel tituloMensagemLibra;
    private javax.swing.JLabel tituloMensagemPeixes;
    private javax.swing.JLabel tituloMensagemSagitario;
    private javax.swing.JLabel tituloMensagemTouro;
    private javax.swing.JLabel tituloMensagemVirgem;
    private javax.swing.JLabel tituloPeixes;
    private javax.swing.JLabel tituloSagitario;
    private javax.swing.JLabel tituloTouro;
    private javax.swing.JLabel tituloVirgem;
    private javax.swing.JPanel touro;
    private javax.swing.JLabel trabalhoAquario;
    private javax.swing.JLabel trabalhoAries;
    private javax.swing.JLabel trabalhoCancer;
    private javax.swing.JLabel trabalhoCapricornio;
    private javax.swing.JLabel trabalhoEscorpiao;
    private javax.swing.JLabel trabalhoGemeos;
    private javax.swing.JLabel trabalhoLeao;
    private javax.swing.JLabel trabalhoLibra;
    private javax.swing.JLabel trabalhoPeixes;
    private javax.swing.JLabel trabalhoSagitario;
    private javax.swing.JLabel trabalhoTouro;
    private javax.swing.JLabel trabalhoVirgem;
    private javax.swing.JTextArea txFortesAquario;
    private javax.swing.JTextArea txFortesAries;
    private javax.swing.JTextArea txFortesCancer;
    private javax.swing.JTextArea txFortesCapricornio;
    private javax.swing.JTextArea txFortesEscorpiao;
    private javax.swing.JTextArea txFortesGemeos;
    private javax.swing.JTextArea txFortesLeao;
    private javax.swing.JTextArea txFortesLibra;
    private javax.swing.JTextArea txFortesPeixes;
    private javax.swing.JTextArea txFortesSagitario;
    private javax.swing.JTextArea txFortesTouro;
    private javax.swing.JTextArea txFortesVirgem;
    private javax.swing.JTextArea txMelhorarAquario;
    private javax.swing.JTextArea txMelhorarAries;
    private javax.swing.JTextArea txMelhorarCancer;
    private javax.swing.JTextArea txMelhorarCapricornio;
    private javax.swing.JTextArea txMelhorarEscorpiao;
    private javax.swing.JTextArea txMelhorarGemeos;
    private javax.swing.JTextArea txMelhorarLeao;
    private javax.swing.JTextArea txMelhorarLibra;
    private javax.swing.JTextArea txMelhorarPeixes;
    private javax.swing.JTextArea txMelhorarSagitario;
    private javax.swing.JTextArea txMelhorarTouro;
    private javax.swing.JTextArea txMelhorarVirgem;
    private javax.swing.JScrollPane txMensagemAquario;
    private javax.swing.JScrollPane txMensagemAries;
    private javax.swing.JScrollPane txMensagemCancer;
    private javax.swing.JScrollPane txMensagemCapricornio;
    private javax.swing.JScrollPane txMensagemEscorpiao;
    private javax.swing.JScrollPane txMensagemGemeos;
    private javax.swing.JScrollPane txMensagemLeao;
    private javax.swing.JScrollPane txMensagemLibra;
    private javax.swing.JScrollPane txMensagemPeixes;
    private javax.swing.JScrollPane txMensagemSagitario;
    private javax.swing.JScrollPane txMensagemTouro;
    private javax.swing.JScrollPane txMensagemVirgem;
    private javax.swing.JScrollPane txPrevisaoAries;
    private javax.swing.JScrollPane txPrevisaoAries10;
    private javax.swing.JScrollPane txPrevisaoAries4;
    private javax.swing.JScrollPane txPrevisaoCancer;
    private javax.swing.JScrollPane txPrevisaoCapricornio;
    private javax.swing.JScrollPane txPrevisaoEscorpiao;
    private javax.swing.JScrollPane txPrevisaoGemeos;
    private javax.swing.JScrollPane txPrevisaoLibra;
    private javax.swing.JScrollPane txPrevisaoPeixes;
    private javax.swing.JScrollPane txPrevisaoSagitario;
    private javax.swing.JScrollPane txPrevisaoTouro;
    private javax.swing.JScrollPane txPrevisaoVirgem;
    private javax.swing.JTextArea txtMensagemAquario;
    private javax.swing.JTextArea txtMensagemAries;
    private javax.swing.JTextArea txtMensagemCancer;
    private javax.swing.JTextArea txtMensagemCapricornio;
    private javax.swing.JTextArea txtMensagemEscorpiao;
    private javax.swing.JTextArea txtMensagemGemeos;
    private javax.swing.JTextArea txtMensagemLeao;
    private javax.swing.JTextArea txtMensagemLibra;
    private javax.swing.JTextArea txtMensagemPeixes;
    private javax.swing.JTextArea txtMensagemSagitario;
    private javax.swing.JTextArea txtMensagemTouro;
    private javax.swing.JTextArea txtMensagemVirgem;
    private javax.swing.JTextArea txtPrevisaoAquario;
    private javax.swing.JTextArea txtPrevisaoAries;
    private javax.swing.JTextArea txtPrevisaoCancer;
    private javax.swing.JTextArea txtPrevisaoCapricornio;
    private javax.swing.JTextArea txtPrevisaoEscorpiao;
    private javax.swing.JTextArea txtPrevisaoGemeos;
    private javax.swing.JTextArea txtPrevisaoLeao;
    private javax.swing.JTextArea txtPrevisaoLibra;
    private javax.swing.JTextArea txtPrevisaoPeixes;
    private javax.swing.JTextArea txtPrevisaoSagitario;
    private javax.swing.JTextArea txtPrevisaoTouro;
    private javax.swing.JTextArea txtPrevisaoVirgem;
    private javax.swing.JPanel virgem;
    // End of variables declaration//GEN-END:variables
}
