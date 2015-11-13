package to;



public class Carro {

    private String marca;
    private String fabricante;
    private double preco;
    private double precoCon;
    private String imagem;
    private String estado;

    public static final String NAO_ENCONTRADA="Não Encontrada";


public Carro(String marca,String fabricante,double preco,double precoCon,String imagem,String estado) {
    this.marca=marca;
    this.fabricante=fabricante;
    this.preco=preco;
    this.precoCon=precoCon;
    this.imagem=imagem;
    this.estado=estado;
}

public Carro()
{}

public String getMarca(){return marca;}
public void setMarca(String marca){this.marca = marca;}

public String getFabricante(){return fabricante;}
public void setFabricante(String fabricante){this.fabricante = fabricante;}

public double getPreco(){return preco;}
public void setPreco(double preco){this.preco = preco;}

    public double getPrecoCon() {return precoCon;}
    public void setPrecoCon(double precoCon){this.precoCon = precoCon;}

    public String getImagem(){return imagem;}
    public void setImagem(String imagem){this.imagem = imagem;}

    public String getEstado(){return estado;}
    public void setEstado(String estado){this.estado = estado;}

   
}
