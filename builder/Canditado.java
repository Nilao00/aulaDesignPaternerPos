public class Canditado {
    private int id;
	private String nome;
    private Boolean aprovado;

	public Canditado(String nome) {
		this.nome = nome;
	}

	public Canditado(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

    public String getAprovado() {
		return nome;
	}

    public Canditado addCanditado(String nomecanditado,Boolean aprovado){
       this.nome = nomecanditado;
       this.aprovado = aprovado;
       
       return this;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Canditado other = (Canditado) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
