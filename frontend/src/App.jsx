import { useEffect, useState } from "react"


function App() {
  const[planes, setPlanes] = useState([])
  const[error, setError] = useState(null)
  const[loading, setLoading] = useState(true) 
  useEffect(()=>{
    fetch("http://localhost:8080/api/planes").then(Resp=>{
      if(!Resp.ok) throw new Error("Error al obtener planes")
      return Resp.json()
    }).then(data=>{
      setPlanes(data)
      setLoading(false)
    }).catch(err=>{
      setError(err.message)
      setLoading(false)
    })
  },[])

  return (
    <div>
      <h1>SPA relax</h1>
      {loading && (
        <div>
          <p>Cargando planes...</p>
          <img
            src="https://upload.wikimedia.org/wikipedia/commons/b/b1/Loading_icon.gif"
            alt="Cargando..."
            style={{ width: 80, height: 80 }}
          />
        </div>
      )}
      {error && <p>Error: {error}</p>}
      <ul>
        {planes.map(plan=>(
          <li>
            <h3>{plan.nombre}</h3>
            <p>{plan.descripcion}</p>
            <strong>{plan.precio}</strong>
          </li>
        ))}
      </ul>
    </div>
  )
}

export default App
