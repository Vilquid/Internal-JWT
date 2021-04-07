# English
# API

API services are generally stateless. They generally do not use a session ID to store user information.

Problem: Authentication requested at each API endpoint. Tokens can help with this.

Endpoint: end of a communication channel
# Token

https://www.google.com/url?sa=i&url=https%3A%2F%2Fdev.to%2Fmattgahrns%2Fwhat-is-a-jwt-fb5&psig=AOvVaw3Zh3XscfM66EnnB1R0VJCf&ust=16178FJAAQfAtCaaa0jaaqaaqaaqaaqaaqaaqaaqaaqaaqaaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqaqa
# JWT
JSON Web Tokens (JWT) are an open method (RFC 7519) for securely representing claims between two parties.

A payload is not secret.

The signature makes it possible to validate the header and the payload that no one checks. If the header or the payload has changed, the calculated signature will not be the same as the signature in the token, fraud can be detected.
The token is transmitted via authentication headers with a Bearer prefix when used in the header.# Français
# Français
# API

Les services API sont généralement sans état. Elles n'utilisent généralement pas d'identifiant de session pour stocker les informations utilisateur.

Problème : authentification demandée à chaque endpoint de l'API. Les tokens peuvent aider à cela.

Endpoint : extrémité d'un canal de communication
# Token

https://www.google.com/url?sa=i&url=https%3A%2F%2Fdev.to%2Fmattgahrns%2Fwhat-is-a-jwt-fb5&psig=AOvVaw3Zh3XscfM66EnnB1R0VJCf&ust=1617854968147000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPjV9smh6-8CFQAAAAAdAAAAABAJ
# JWT
Les JSON Web Tokens (JWT) sont une méthode ouverte (RFC 7519) pour représenter de manière sécurisée des créances (claims) entre deux parties.

Un payload n’est pas secret.

La signature permet de valider le header et le payload que personne ne vérifie. Si le header ou le payload a changé, la signature calculée ne sera pas la même que la signature dans le token, la fraude peut être détectée.
Le token est transmis via les headers d'authentification avec un préfixe Bearer lorsqu'il est utilisé dans le header.
