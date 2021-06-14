const getDatos = async (id) => {
const url = "/minipokeapi/" + id

  try {
    const response = await fetch(url);
    const datos = await response.json();
    let imagen = datos.image
    let nombre = datos.name
    let id = datos.id
    await $("#mostrar").append(
    "<div class='card' style='width: 30%;'><img class='card-img-top' src="+imagen+
    "><div class='card-body'><h5 class='card-title'>"+nombre+
    "</h5><button onclick='llenardatos("+id+
    ")' data-toggle='modal' data-target='#poke' class='btn btn-outline-danger'>Ver info</button></div></div>");
  } catch (err) {
    console.log(err);
  }
};

inicioPagina();

function inicioPagina() { //para obtener solo los 20 primeros pokemon en index
  for (let i = 1; i <= 20; i++) {
    id = i;
    getDatos(id);
  }
}

const llenardatos = async (id) => {

  const url = "/minipokeapi/" + id
try {
    const response = await fetch(url);
    const datos = await response.json();
    let nombre = datos.name
    let habilidades = datos.abilities
    let tipo = datos.type
    let peso = datos.weight

    let id = datos.id
    $("#nombrePoke").text(nombre);
    $("#peso").text("Peso: " +peso);
    $("#habilidades").text("Habilidades: "+habilidades);
    $("#tipo").text("Tipo: " +tipo);

} catch (err) {
  console.log(err);
}

}