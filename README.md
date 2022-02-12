# Taller de GIT

Clonar un repositorio remoto
git clone URL_REPO
git clone https://github.com/jhonynava/TallerGIT.git

Inicializar un repositorio
git init

Stagin (Revisar el estado actual de mis archivos)
git status

Agregar un archivo
git add nombre_archivo

Agregar varios archivos
git add .

Agregar comentario
git commit -m "Comentario X"

Modificar el commit (Hace referencia al último commit realizado)
git commit --amend -m "Mensaje"

Guardar cambios
git push -u nombre_repositorio nombre_rama
git push -u origin main

Agregar un repositorio remoto
git remote add nombre_repositorio URL_REPO
git remote add tallerGIT https://github.com/jhonynava/TallerGIT.git

Visualizar los repositorios remotos que tenemos
git remote -v

Actualizar cambios
git pull nombre_repositorio (Actualizar todos las ramas del repositorio)
git pull nombre_repositorio nombre_rama (Actualizar la rama especificada)
git fetch nombre_repositorio (Actualizar cambios sin fusionar los locales)
git fetch --all --prune (Actualizar el repositorio y borar ramas que ya no existen)

git pull origin
