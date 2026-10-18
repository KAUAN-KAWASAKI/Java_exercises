# Compila tudo e executa a Main de um módulo.
# Uso:  ./run.ps1 m03_heranca
#       ./run.ps1 exercicios.e01_retangulo     (pacote dentro de poo)
#       ./run.ps1                              (lista os módulos)
param([string]$Modulo)

$raiz = $PSScriptRoot
$base = Join-Path $raiz 'src\poo'

if (-not $Modulo) {
    Write-Host "Módulos disponíveis:"
    Get-ChildItem $base -Directory | ForEach-Object { Write-Host "  $($_.Name)" }
    return
}

$out = Join-Path $raiz 'out'
New-Item -ItemType Directory -Force $out | Out-Null

$fontes = Get-ChildItem (Join-Path $raiz 'src') -Recurse -Filter *.java | ForEach-Object { $_.FullName }
if (-not $fontes) { Write-Host "Nenhum .java encontrado."; return }

javac -encoding UTF-8 -d $out $fontes
if ($LASTEXITCODE -ne 0) { return }

java '-Dfile.encoding=UTF-8' '-Dstdout.encoding=UTF-8' -cp $out "poo.$Modulo.Main"
