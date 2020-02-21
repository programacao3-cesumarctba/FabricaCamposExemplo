package com.github.mayconmoraesdm.fabricacampo;

public class FabricaCampo {
    // Atributos
    private String name;
    private String id;
    private String onclick;
    private String onchange;
    private String tamanho;
    private String type;
    private String value;
    private Boolean visivel;
    private String tela;
    private Boolean required;
    private Boolean readOnly;
    private String html;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOnclick() {
        return onclick;
    }

    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    public String getOnchange() {
        return onchange;
    }

    public void setOnchange(String onchange) {
        this.onchange = onchange;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getType() {
        if (type == null) {
            return "text";
        }
        return type;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        if (value == null) {
            return "";
        }
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getVisivel() {
        return visivel;
    }

    public void setVisivel(Boolean visivel) {
        this.visivel = visivel;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }


    public FabricaCampo(String name, String id, String tela) {
        this.name = name;
        this.id = id;
        this.tela = tela;
    }


    public String html() {
        String html = String.format("<input type='%s' id='%s' name='%s'  value='%s'>",
                getType(), getId(), getName(), getValue());

        return html;
    }








}
