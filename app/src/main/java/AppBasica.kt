import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.baseapp.ui.theme.BaseAppTheme

class AppBasica {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BaseAppTheme {

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { CenterAlignedTopAppBar(title = { Text(text = "First App Bar") }) }
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                            .background(Color(0xFFECECEC)) // Fondo general claro
                    ) {
                        // Primera fila con un elemento
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp)
                                .background(Color(0xFFFFC107)) // Fondo amarillo
                                .border(2.dp, Color(0xFF795548)), // Borde marrón,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(text = "Elemento en la primera fila", color = Color.Black)
                        }

                        // Segunda fila con dos columnas
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(intrinsicSize = IntrinsicSize.Min)
                                .padding(8.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            // Primera columna con dos elementos y separador
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .background(Color(0xFF8BC34A)) // Fondo verde claro
                                    .border(2.dp, Color(0xFF4CAF50)) // Borde verde oscuro
                                    .padding(8.dp)
                            ) {
                                Text(text = "Elemento 1 en columna 1", color = Color.White)
                                Spacer(Modifier.height(8.dp))
                                Text(text = "Elemento 2 en columna 1", color = Color.White)
                            }

                            Spacer(Modifier.width(8.dp))

                            // Segunda columna con un elemento
                            Column(
                                modifier = Modifier
                                    .weight(2f)
                                    .fillMaxHeight()
                                    .background(Color(0xFF03A9F4)) // Fondo azul claro
                                    .border(2.dp, Color(0xFF0288D1)) // Borde azul oscuro
                                    .padding(8.dp),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(text = "Elemento en columna 2", color = Color.White)
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(8.dp)
                                .background(Color(0xFFE91E63)) // Fondo rojo claro))
                                .border(2.dp, Color(0xFFB0003A)), // Borde rojo oscuro ,
                            verticalAlignment = Alignment.Bottom,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(text = "Elemento en la tercera fila", color = Color.Black)
                        }
                    }
                }
            }
        }
    }
    }