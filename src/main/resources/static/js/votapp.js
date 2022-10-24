var vectorCandidatos = new Array(4);

vectorCandidatos[0] = 0;
vectorCandidatos[1] = 0;
vectorCandidatos[2] = 0;
vectorCandidatos[3] = 0;

function votar(numCandidato) {
    vectorCandidatos[numCandidato] = vectorCandidatos[numCandidato] + 1;
    alert("Gracias por su voto!");
}

function estadistica() {
    let totVotos = vectorCandidatos[0] + vectorCandidatos[1] + vectorCandidatos[2] + vectorCandidatos[3];
    let porCan1 = (vectorCandidatos[0] / totVotos) * 100;
    let porCan2 = (vectorCandidatos[1] / totVotos) * 100;
    let porCan3 = (vectorCandidatos[2] / totVotos) * 100;
    let porCan4 = (vectorCandidatos[3] / totVotos) * 100;

    let nodoParrafo = document.createElement('p');
    let nodoParrafo1 = document.createElement('p');
    let nodoParrafo2 = document.createElement('p');
    let nodoParrafo3 = document.createElement('p');
    let nodoParrafo4 = document.createElement('p');

    let textoNodo = document.createTextNode("Votos Candidato 1: " + vectorCandidatos[0] + " - Porcentaje: " + porCan1.toFixed(2) + "%");
    let textoNodo1 = document.createTextNode("Votos Candidato 2: " + vectorCandidatos[1] + " - Porcentaje: " + porCan2.toFixed(2) + "%");
    let textoNodo2 = document.createTextNode("Votos Candidato 3: " + vectorCandidatos[2] + " - Porcentaje: " + porCan3.toFixed(2) + "%");
    let textoNodo3 = document.createTextNode("Votos Candidato 4: " + vectorCandidatos[3] + " - Porcentaje: " + porCan4.toFixed(2) + "%");
    let textoNodo4 = document.createTextNode("Total Votos: " + totVotos);

    nodoParrafo.appendChild(textoNodo);
    nodoParrafo1.appendChild(textoNodo1);
    nodoParrafo2.appendChild(textoNodo2);
    nodoParrafo3.appendChild(textoNodo3);
    nodoParrafo4.appendChild(textoNodo4);

    let elementDiv = document.getElementById("conEst");
    elementDiv.appendChild(nodoParrafo);
    elementDiv.appendChild(nodoParrafo1);
    elementDiv.appendChild(nodoParrafo2);
    elementDiv.appendChild(nodoParrafo3);
    elementDiv.appendChild(nodoParrafo4);

    // Obtener una referencia al elemento canvas del DOM
    const $grafica = document.querySelector("#grafica");
    // Las etiquetas son las que van en el eje X. 
    const etiquetas = ["Candidato1", "Candidato2", "Candidato3", "Candidato4"]
    // Podemos tener varios conjuntos de datos. Comencemos con uno
    const datosVotos = {
        label: "Votos por Candidato",
        data: [vectorCandidatos[0], vectorCandidatos[1], vectorCandidatos[2], vectorCandidatos[3]], // La data es un arreglo que debe tener la misma cantidad de valores que la cantidad de etiquetas
        backgroundColor: 'rgba(54, 162, 235, 0.2)', // Color de fondo
        borderColor: 'rgba(54, 162, 235, 1)', // Color del borde
        borderWidth: 1,// Ancho del borde
    };
    new Chart($grafica, {
        type: 'line',// Tipo de gráfica
        data: {
            labels: etiquetas,
            datasets: [
                datosVotos,
                // Aquí más datos...
            ]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }],
            },
        }
    });
}